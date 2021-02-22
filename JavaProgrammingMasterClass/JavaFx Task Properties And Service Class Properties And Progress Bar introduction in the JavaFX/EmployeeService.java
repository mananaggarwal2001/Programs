package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.concurrent.Service;
import javafx.concurrent.Task;

public class EmployeeService extends Service<ObservableList<String>> {
    @Override
    protected Task<ObservableList<String>> createTask() {
        return new Task<ObservableList<String>>() {
            @Override
            protected ObservableList<String> call() throws Exception {
                String[] names = {"Manan Aggarwal",
                        "Aman Kaintura",
                        "Naman Aggarwal",
                        "Mummy",
                        "Papa"};

                ObservableList<String> employeeList = FXCollections.observableArrayList();
                for(int i=0;i<5;i++){
                    employeeList.add(names[i]);
                    updateProgress(i+1,6);
                    Thread.sleep(200);
                    updateMessage("Added: " + names[i]);

                }
                return employeeList;
            }
        };
    }
}
