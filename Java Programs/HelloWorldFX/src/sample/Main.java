package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
//        GridPane root=new GridPane();
//        root.setAlignment(Pos.CENTER); //root alignment takes the pos value using POS.CENTER
//        root.setVgap(10);// Setting the vertical gap using gridpane.
//        root.setHgap(30);// Setting the horizontal gap using gridpane.
//        Label greeting=new Label("Welcome to java Fx control"); // Label is a obejct of javaFx which we call to setup the label
//        greeting.setTextFill(Color.GREEN);
//        greeting.setFont(Font.font("Times New Roman", FontWeight.BOLD,20));
//        root.getChildren().add(greeting); // we always have to use the root . getchildren() in order to get the children and we have use the add control
//                                            // method to add the label on the screen of the root.

        primaryStage.setTitle("Hello JavaFx");
        primaryStage.setScene(new Scene(root, 700, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
