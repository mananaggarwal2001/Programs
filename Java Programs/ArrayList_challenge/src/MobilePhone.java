import org.w3c.dom.DOMImplementationSource;

import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone {
    private Scanner scanner = new Scanner(System.in);
    private ArrayList<Long> contacts = new ArrayList<Long>();
    private long number;
    private String name;
    private ArrayList<String> contacts_name = new ArrayList<String>();

    public boolean input() {
        boolean decide;
        System.out.print("Enter the Phone Number: ");
        number = scanner.nextLong();
        scanner.nextLine();
        System.out.print("Enter the Contact Name: ");
        name = scanner.nextLine();
        System.out.print("Are you Sure Want to Store the Contact: ");
        decide = scanner.nextBoolean();
        if (decide) {
            StoreContacts();
        }
        return false;
    }

    private void StoreContacts() {
        contacts.add(number);
        contacts_name.add(name);
    }

    public void printContacts() {
        if(contacts.size()==0){
            System.out.println("No elements has been found");
        }else {
            for (int i = 0; i < contacts.size(); i++) {
                System.out.println((i + 1) + ". " + "Number is: " + contacts.get(i) + " And Name is: " + contacts_name.get(i));
            }
        }
    }

    public String Search() {
        String searchitem;
        System.out.print("Enter the contact Name Which you want to find: ");
        searchitem = scanner.nextLine();
        int position_Contactname = contacts_name.indexOf(searchitem);
        if (position_Contactname >= 0) {
            System.out.println("Contact Found: ");
            System.out.println(contacts.get(position_Contactname));
            System.out.println(contacts_name.get(position_Contactname));
            return contacts_name.get(position_Contactname);
        }
        return null;
    }

    public boolean Update() {
        String Storename=Search();
        String replace_name;
        boolean surity;
        int index = contacts_name.indexOf(Storename);
        if (Storename != null) {
            System.out.print(" Contact Found at this Position: "+ index);
            System.out.print("Enter the ContactName Which you want to Replace: ");
            replace_name=scanner.nextLine();
            System.out.println();
            System.out.print("Are you sure want to replace the contact Name " + contacts_name.get(index)+" With this Number "+ contacts.get(index));
            surity=scanner.nextBoolean();
            if(surity){
                contacts_name.set(index,replace_name);
                System.out.print("Replaced Name " + contacts_name.get(index)+" With this Number "+ contacts.get(index));
            }

        }
        return false;
    }
    public boolean Remove(){
        boolean Surity;
        String Storeename=Search();
        int index=contacts_name.indexOf(Storeename);
        scanner.nextLine();
        System.out.print("Are you want to remove the contact");
        Surity=scanner.nextBoolean();
        if(Surity) {
            if (contacts.indexOf(Storeename) == contacts_name.indexOf(Storeename)) {
                long number =contacts.get(index);
                contacts.remove(number);
                contacts_name.remove(Storeename);
            }
        }
        return false;
    }

}

