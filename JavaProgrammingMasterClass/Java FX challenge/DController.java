package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class DController {

    @FXML
    private TextField firstname;

    @FXML
    private TextField lastname;

    @FXML
    private TextField phonenumber;

    @FXML
    private TextArea notes;

    public ContactDetail processresult() {
        String Fname = firstname.getText().trim();
        String Lname = lastname.getText().trim();
        String phnumber = phonenumber.getText();
        String note = notes.getText().trim();

        ContactDetail contactDetail = new ContactDetail(Fname, Lname, Long.parseLong(phnumber), note);

        Contactdata.getInstance().addcontact(contactDetail);
        return contactDetail;
    }

}
