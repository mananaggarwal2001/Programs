package sample;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private TextField nameFeild;//@Fxml is used  for linking the sample.fxml and
                                // text feild variable with textbox that have been made in the fxml file.

    @FXML
    private Button hellobutton;

    @FXML
    private Button Byebutton;

    @FXML
    private CheckBox mycheckbox;
    @FXML
    private Label ourlabel;



    @FXML
    public void initialize (){
        hellobutton.setDisable(true);
        Byebutton.setDisable(true);
    }

    @FXML
    public void onButtonAction(ActionEvent actionEvent){

        if(actionEvent.getSource().equals(hellobutton)){
            System.out.println("Hello, "+ nameFeild.getText());
        }else if(actionEvent.getSource().equals(Byebutton)){
            System.out.println("Bye, " + nameFeild.getText());
        }
        Runnable task=new Runnable() {
            @Override
            public void run() {
                try{
                    Thread.sleep(1000);
                    Platform.runLater(new Runnable() {
                        @Override
                        public void run() {
                            String s=Platform.isFxApplicationThread() ? "UI Thread" : "Background Thread";
                            System.out.println("I'm updating the label on the " + s);
                            ourlabel.setText("We did something");
                        }
                    });
                     } catch(InterruptedException event){
                    // we dont care about this
                }
            }
        };
        new Thread(task).start();

        if(mycheckbox.isSelected()){
            nameFeild.clear();
            hellobutton.setDisable(true);
            Byebutton.setDisable(true);
        }

    }
    @FXML
    public void Buttonhandlertext(){
        String text=nameFeild.getText();
        boolean disable = (text.isEmpty() || text.trim().isEmpty());//trim() results include spaces.
        hellobutton.setDisable(disable);
        Byebutton.setDisable(disable);
    }
    public void handleCheck(){
        System.out.println(" The checkbox is " + (mycheckbox.isSelected() ? "Checked" : "Not Checked"));
    }
}
