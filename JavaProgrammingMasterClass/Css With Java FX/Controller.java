package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.DirectoryChooser;
import javafx.stage.FileChooser;

import javax.crypto.spec.DESKeySpec;
import java.io.File;
import java.util.List;

public class Controller {
    @FXML
    private Label label;

    @FXML
    private Button button;

    @FXML
    private GridPane gridPane;

    @FXML
    private Hyperlink link;

    @FXML
    public void initialize() {
        button.setEffect(new DropShadow());
    }

    @FXML
    public void handleMouseClick() {
        label.setScaleX(2.0);
        label.setScaleY(2.0);
    }

    @FXML
    public void handleMouseExit() {
        label.setScaleX(1.0);
        label.setScaleY(1.0);
    }

    @FXML
    public void handleClick() {
        FileChooser Chooser = new FileChooser();
        Chooser.setTitle("Save Application File");

        Chooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("Text", "*.txt"),      // s: save as  type and *.txt as how we can save the file.
                new FileChooser.ExtensionFilter("PDF", "*.pdf"),
                new FileChooser.ExtensionFilter("Image Files", "*.jpg", "*.png", "*.gif"),
                new FileChooser.ExtensionFilter("All Files", "*.*")
        );
//        fileChooser.showOpenDialog(gridPane.getScene().getWindow()); // Bracket contain the parent window name.

//        DirectoryChooser chooser= new DirectoryChooser();
        List<File> file = Chooser.showOpenMultipleDialog(gridPane.getScene().getWindow());
        if (file != null) {
            for (int i = 0; i < file.size(); i++) {
//            System.out.println(file.getPath());
                System.out.println(file.get(i));
            }
        } else{
            System.out.println("Choose was cancelled");
        }
    }

    @FXML
    public void onLinkClick(){
        System.out.println(getClass());
        
    }
}
