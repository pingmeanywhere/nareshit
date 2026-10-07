package corejava.part3.objectClass.lab2;

import java.util.Scanner;

public class MobileContactBackupSystem {

    static void main(String[] args) throws CloneNotSupportedException {

        Scanner sc = new Scanner(System.in);

        String contactId = sc.nextLine();
        String name = sc.nextLine();
        String phoneNumber = sc.nextLine();
        String countryCode = sc.nextLine();

        if (contactId.length() < 3 || name.length() < 2 ||
                phoneNumber.length() < 6 || countryCode.isEmpty()) {
            System.out.println("Error: Invalid contact details");
            return;
        }

        Contact contact = new Contact(contactId, name, phoneNumber, countryCode);
        System.out.println("Original Contact: " + contact);

        Contact copyContact = contact.clone();
        copyContact.phoneNumber = "9988776655";

        System.out.println("Cloned Contact: " + copyContact);


    }
}

class Contact implements Cloneable {
    String contactId;
    String name;
    String phoneNumber;
    String countryCode;

    public Contact(String contactId, String name, String phoneNumber, String countryCode) {
        this.contactId = contactId;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.countryCode = countryCode;
    }

    public Contact clone() throws CloneNotSupportedException {
        return (Contact) super.clone();
    }

    public String toString() {
        return contactId + " " + name + " " + phoneNumber + " " + countryCode;
    }
}