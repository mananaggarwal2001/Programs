package sample;

import javafx.beans.property.*;

public class ContactDetail {

    private SimpleStringProperty Firstname;
    private SimpleStringProperty LastName;
    private SimpleLongProperty Contact;
    private SimpleStringProperty notes;

    public ContactDetail(String firstname, String lastName, Long contact, String notes) {

                Firstname = new SimpleStringProperty(firstname);
                LastName = new SimpleStringProperty(lastName);
                Contact = new SimpleLongProperty(contact);
                this.notes = new SimpleStringProperty(notes);
    }

    public String getFirstname() {
        return Firstname.get();
    }

    public SimpleStringProperty firstnameProperty() {
        return Firstname;
    }

    public void setFirstname(String firstname) {
        Firstname.set(firstname);
    }

    public String getLastName() {
        return LastName.get();
    }

    public SimpleStringProperty lastNameProperty() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName.set(lastName);
    }

    public long getContact() {
        return Contact.get();
    }

    public SimpleLongProperty contactProperty() {
        return Contact;
    }

    public void setContact(long contact) {
        Contact.set(contact);
    }

    public String getNotes() {
        return notes.get();
    }

    public SimpleStringProperty notesProperty() {
        return notes;
    }

    public void setNotes(String note) {
        notes.set(note);
    }
}
