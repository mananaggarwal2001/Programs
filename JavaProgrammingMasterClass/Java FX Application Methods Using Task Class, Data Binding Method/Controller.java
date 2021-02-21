package sample;

import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.concurrent.Task;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.ProgressBar;

public class Controller {
    private Task<ObservableList<String>> task;
    @FXML
    private ListView listView;

    @FXML
    private ProgressBar progressBar;

    @FXML
    private Label progressLabel;

    public void initialize(){
     task=new Task<ObservableList<String>>() {
         @Override
         protected ObservableList<String> call() throws Exception {
             Thread.sleep(1000);

             String[] names = {"Manan Aggarwal",
                     "Aman Kaintura",
                     "Naman Aggarwal",
                     "Mummy",
                     "Papa"};

                ObservableList<String> employeeList = FXCollections.observableArrayList();


//             Platform.runLater(new Runnable() {   // bad Practice For Updating the UI List
//                 @Override
//                 public void run() {
//                     listView.setItems(employeeList);
//                 }
//             });

             for(int i=0;i<5;i++){
                 employeeList.add(names[i]);
                 updateProgress(i+1,6);    // Update Progress is a Method Which takes
                                                // Two Parameters Current Progress and The Maximum Progress.
                 Thread.sleep(200);
                 updateMessage("Added: " + names[i]); // Updates The Message For Every Loop in The UI Application
                                                      //  And It is method inbuilt in the Task.
             }
             return employeeList;
         }
     };

     listView.itemsProperty().bind(task.valueProperty()); // it's is used For Binding the items Property to the Task value Property
     progressBar.progressProperty().bind(task.progressProperty());
     progressLabel.textProperty().bind(task.messageProperty());  // Used For Binding the Text Property to the Message Property of the task of the
                                                                 // Label For showing Which  One was Added in the List.




                                                           // So that on clicking the button we get an Updated UI List and Things which we can
                                                          // Update in the Observable Array List Could Been Shown
                                                          // We can PerForming Task on the BackGround Thread and UPdating the Task On the UI Thread.
                                                          // ListView Does Not Care About what Was Happening In the Background
                                                          // Listview Just Display the list of the Employee in the UI Application

}

    @FXML
    public void ButtonPressed(){
        new Thread(task).start();
    }
}
