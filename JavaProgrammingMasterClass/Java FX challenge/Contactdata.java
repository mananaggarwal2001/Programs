package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Contactdata {
    private static Contactdata instance;


    private ObservableList<ContactDetail> contacts;

    private Contactdata(){
        contacts= FXCollections.observableArrayList();
    }

    public ObservableList<ContactDetail> getContacts() {
        return contacts;
    }

    public static Contactdata getInstance(){
        if(instance==null){
            instance=new Contactdata();
        }
        return instance;
    }


    public void addcontact(ContactDetail contactDetail){
        contacts.add(contactDetail);
    }
    public void deletecontact(ContactDetail contactDetail){
        contacts.remove(contactDetail);
    }

}
