package com.manan.todolist;

import com.manan.todolist.datamodel.TodoData;
import com.manan.todolist.datamodel.TodoItem;
import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.*;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class Controller {
    private List<TodoItem> todoItems;

    @FXML
    private ListView<TodoItem> Todolistview;

    @FXML
    private TextArea fulldescription;

    @FXML
    private Label deadlineLabel;

    @FXML
    private BorderPane mainborderpane;

    @FXML
    private ContextMenu listcontextmenu;

    @FXML
    private ToggleButton showTodaysItem;

    private FilteredList<TodoItem> filteredList;

    private Predicate<TodoItem> wantAllitems;

    private Predicate<TodoItem> wantTodayItems;


    public void initialize() {


        Todolistview.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<TodoItem>() {
            @Override
            public void changed(ObservableValue<? extends TodoItem> observableValue, TodoItem todoItem, TodoItem t1) {   // this type of event handler will anonmously work.
                if (todoItems != null) {
                    TodoItem item = Todolistview.getSelectionModel().getSelectedItem(); //to retreave the selected item
                    fulldescription.setText(item.getDetails()); // display the selected item in the textfeild area.
                    DateTimeFormatter df = DateTimeFormatter.ofPattern("d/MMMM/yyyy");    //"MMMM d,yyyy");
                    deadlineLabel.setText(df.format(item.getDeadline()));
                }
            }
        });


        wantAllitems=new Predicate<TodoItem>() {
            @Override
            public boolean test(TodoItem item) {
                return true;
            }
        };

        wantTodayItems=new Predicate<TodoItem>() {
            @Override
            public boolean test(TodoItem item) {
                return item.getDeadline().equals(LocalDate.now());
            }
        };


        listcontextmenu = new ContextMenu();
        MenuItem deletemenuitem = new MenuItem("Delete");

        deletemenuitem.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                TodoItem item = Todolistview.getSelectionModel().getSelectedItem();
                deleteitem(item);
            }
        });
        listcontextmenu.getItems().addAll(deletemenuitem); // for adding delete option in the list context menu.

        filteredList=new FilteredList<TodoItem>(TodoData.getInstance().getTodoitems(),wantAllitems);



        SortedList<TodoItem> sortedList=new SortedList<TodoItem>(filteredList, new Comparator<TodoItem>() {
            @Override
            public int compare(TodoItem o1, TodoItem o2) {
                  return o1.getDeadline().compareTo(o2.getDeadline());
                                                                //o1<o2 return -1
            }                                               //o1==o2 return 0
                                                            // o1>o2 return 1}
        });

        //Todolistview.setItems(TodoData.getInstance().getTodoitems());
        // due to data binding we need not to add items to the list explictly. it will automatically detect the changes in the list and act accordingly.
        Todolistview.setItems(sortedList);

        Todolistview.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
        Todolistview.getSelectionModel().selectFirst();

//        Todolistview.setCellFactory(new Callback<ListView<TodoItem>, ListCell<TodoItem>>() {
//            @Override
//            public ListCell<TodoItem> call(ListView<TodoItem> todoItemListView) {     // we are using anonymous class and lambda expression
//                ListCell<TodoItem> item=new ListCell<>();
//
//                item.emptyProperty().addListener(
//                        (obs,wasEmpty,IsNowEmpty) ->{
//                            if(IsNowEmpty){
//                                item.setContextMenu(null);
//                            }else{
//                                item.setContextMenu(listcontextmenu);
//                            }
//                        }
//                );
//                return item;
//            }
//
//        });

    }

    @FXML
    public void handlekeypress(KeyEvent keyEvent){
        TodoItem selecteditem= Todolistview.getSelectionModel().getSelectedItem();
        if(selecteditem!=null){
            if(keyEvent.getCode().equals(KeyCode.DELETE)){
                deleteitem(selecteditem);
            }
        }
    }

    @FXML
    public void showNewItemDilogue() {

        Dialog<ButtonType> dialog = new Dialog<>(); //created the instance of the dilogue class but that doesnt load the UI.


        dialog.initOwner(mainborderpane.getScene().getWindow());
        dialog.setTitle("Add New Todo Item");
        dialog.setHeaderText("Use This To Create and Add The New Todo Item");
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("todoitemdialog.fxml"));

        try {
            dialog.getDialogPane().setContent(fxmlLoader.load()); // for displaying the content in the UI window.

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Could't make a new window");
        }

        dialog.getDialogPane().getButtonTypes().add(ButtonType.OK);    //get the buttons on the new UI window.
        dialog.getDialogPane().getButtonTypes().add(ButtonType.CANCEL);


        Optional<ButtonType> result = dialog.showAndWait();
        if ((result.isPresent()) && (result.get() == ButtonType.OK)) {
            DialogController controller = fxmlLoader.getController();
            TodoItem item = controller.processresult();
            Todolistview.getSelectionModel().select(item);
        }
    }

    @FXML
    public void clicklistView() {
        TodoItem item = Todolistview.getSelectionModel().getSelectedItem();
//        System.out.println("The Selected item is : " + item);
        fulldescription.setText(item.getDetails());
        deadlineLabel.setText(item.getDeadline().toString());

//        StringBuilder ap=new StringBuilder(item.getDetails());
//        ap.append("\n\n\n\n");
//        ap.append("Due: ");
//        ap.append(item.getDeadline().toString());
//        fulldescription.setText(ap.toString());
    }

    @FXML
    public void deleteitem(TodoItem item) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Delete TodoItem");
        alert.setHeaderText("Delete item: " + item.getShortdescription());
        alert.setContentText("ARE YOU SURE WANT TO DELETE THE SELECTED  ITEM");
        // In terms of button alert will provide those buttons automatically like ok and cancel button

        Optional<ButtonType> result = alert.showAndWait();
        if ((result.isPresent()) && (result.get() == ButtonType.OK)) {
            TodoData.getInstance().deletetodoitem(item);
        }

    }
    public void handleFilterButton(){
        TodoItem item=Todolistview.getSelectionModel().getSelectedItem();
        if(showTodaysItem.isSelected()){
            filteredList.setPredicate(wantTodayItems);//help in predicting the behaviour of the toggle button.
            if(filteredList.isEmpty()){
                fulldescription.clear();
                deadlineLabel.setText("");
                Todolistview.getSelectionModel().select(item);
            }
        } else {
            filteredList.setPredicate(wantAllitems);
            Todolistview.getSelectionModel().select(item);
        }

    }
    @FXML
    public void handleExit(){
        Platform.exit();    // Use For Exiting the Platform.
    }
}
