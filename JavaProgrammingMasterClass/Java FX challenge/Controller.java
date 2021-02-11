package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;

import java.io.IOException;
import java.util.Optional;

public class Controller {

    @FXML
    private TableView<ContactDetail> tableview;

    @FXML
    private TableColumn<ContactDetail, String> firstname;

    @FXML
    private TableColumn<ContactDetail, String> lastname;

    @FXML
    private  BorderPane mainborderpane;

    @FXML
    private TableColumn<ContactDetail, Long> contactno;

    @FXML
    private TableColumn<ContactDetail, String> notes;

    @FXML
    private ContextMenu contextMenu;

    public void initialize() {
        this.contextMenu = new ContextMenu();
        MenuItem menuItem = new MenuItem("Delete");
        menuItem.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                ContactDetail contactDetail = tableview.getSelectionModel().getSelectedItem();
                deleteoption(contactDetail);
            }
        });
        contextMenu.getItems().add(menuItem);
        tableview.setItems(Contactdata.getInstance().getContacts());

    }

    public void handledeleteoption() {
        ContactDetail selecteditem = tableview.getSelectionModel().getSelectedItem();
        if (selecteditem != null) {
            deleteoption(selecteditem);
        } else{
            Alert alert=new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText(null);
            alert.setTitle("WARNING");
            alert.setContentText("ITEM NOT SELECTED");
            alert.showAndWait();
        }
    }

    @FXML
    public void deleteoption(ContactDetail contactDetail) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Delete");
        alert.setHeaderText("Are you sure want to delete");
        Optional<ButtonType> result = alert.showAndWait();
        if ((result.get() == ButtonType.OK) && result.isPresent()) {
            Contactdata.getInstance().deletecontact(contactDetail);
        }
    }

    @FXML
    public void setnewdialogpane() {
        Dialog<ButtonType> dialog = new Dialog<>(); // for implementing the dialog window.


        dialog.initOwner(mainborderpane.getScene().getWindow()); //initiate the owner of the dialog pane.
        dialog.setTitle("Contact detail");
        dialog.setHeaderText("Add A New Contact Details");
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("diloguedetail.fxml"));
        try {
            dialog.getDialogPane().setContent(fxmlLoader.load()); // for displaying the content in the UI window.

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Could't make a new window");
        }

        dialog.getDialogPane().getButtonTypes().add(ButtonType.OK);
        dialog.getDialogPane().getButtonTypes().add(ButtonType.CANCEL);

        Optional<ButtonType> result = dialog.showAndWait();
        if ((result.isPresent()) && (result.get() == ButtonType.OK)) {
            DController controller = fxmlLoader.getController();
            ContactDetail item = controller.processresult();
            tableview.getSelectionModel().select(item);
        }

    }

    public void handleModified() {
        ContactDetail contactdetail = tableview.getSelectionModel().getSelectedItem();
        if (contactdetail!=null) {
            Dialog<ButtonType> dialog = new Dialog<>();


            dialog.setTitle("Modify Contact");
            dialog.setHeaderText("Modify the existing Contact");
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("diloguedetail.fxml"));
            try {
                dialog.getDialogPane().setContent(fxmlLoader.load()); // for displaying the content in the UI window.

            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("Could't make a new window");
            }

            dialog.getDialogPane().getButtonTypes().add(ButtonType.OK);
            dialog.getDialogPane().getButtonTypes().add(ButtonType.CANCEL);

            Optional<ButtonType> result = dialog.showAndWait();
            if ((result.isPresent()) && (result.get() == ButtonType.OK)) {
                ContactDetail contactDetail = tableview.getSelectionModel().getSelectedItem();
                Contactdata.getInstance().deletecontact(contactDetail);
                DController controller = fxmlLoader.getController();
                ContactDetail item = controller.processresult();
                tableview.getSelectionModel().select(item);
            }
        } else {
            Alert alert=new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText(null);
            alert.setTitle("WARNING");
            alert.setContentText("ITEM NOT SELECTED");
            alert.showAndWait();
        }

    }
}