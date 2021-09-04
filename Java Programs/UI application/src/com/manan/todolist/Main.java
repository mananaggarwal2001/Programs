package com.manan.todolist;

import com.manan.todolist.datamodel.TodoData;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("Main_Window.fxml"));
        primaryStage.setTitle("Todo List");
        primaryStage.setScene(new Scene(root, 700, 900));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void stop() throws Exception {
        try{
            TodoData.getInstance().storetodoitems();

        } catch(IOException e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void init() throws Exception {
        try{
            TodoData.getInstance().loadTodoitems();

        } catch(IOException e){

            System.out.println(e.getMessage());
        }
    }
}
