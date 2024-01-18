package gr.aueb.cf.ch10;

import java.util.Arrays;
import java.util.Scanner;

public class MobileContactsApp {

    final static Scanner in = new Scanner(System.in);
    final static String[][] contacts = new String[500][3];
    static int pivot = -1;

    public static void main(String[] args) {

    }

    /*
     *Controllers.
     */

    public static String insertContactContollers(String[] contacts) {
        String response = "";
        String[] errorsArray;

        if (contacts == null) return "NullError";

        try {
            errorsArray  = validateInsertContacts(contacts);
            if (!errorsArray[0].isEmpty() || !errorsArray[1].isEmpty() || !errorsArray[2].isEmpty()) {
                for (String message : errorsArray) {
                    response += message + "\n";
                }
                return response;   // validation failure.
            }
            insertContactService(contacts);
            response = "OK" ;  // success
        } catch (Exception e) {
            e.getMessage();   // exception felure.
        }
        return response;
    }

    public static String[] validateInsertContacts(String[] contacts) {

        String[] errorsArray = new String[] {"","",""};

        if (!contacts[0].matches("\\S+") || contacts[0].length() < 2) {
            errorsArray[0] = "invFirstname";
        }
        if (!contacts[1].matches("\\S+") || contacts[1].length() < 2) {
            errorsArray[1] = "invLastname";
        }
        if (!contacts[2].matches("\\S+") || contacts[2].length() != 10) {
            errorsArray[2] = "invPhoneNumber";
        }
        return errorsArray;
    }



    /*
     * Service Layer
     */

    public static String[] getContactByPhoneNumberService(String phoneNumber) throws Exception{
        String[] contact;
        try {
            contact = getByPhoneNumber(phoneNumber);
            if (contact.length == 0) {
                throw new Exception("Contact not Found");
            }
            return contact;
        } catch (Exception e) {
            // logging
            throw e;
        }
    }

    public static String[][] getAllContactsService()throws Exception {
        String[][] allContacts;

        try {
            allContacts = getAllContacts();
            if (allContacts.length == 0) {
                throw new Exception("List is Empty");
            }
            return allContacts;
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    public static void insertContactService(String... contacts) throws Exception {       //  varargs ... σαν μορφη πινακα αλλα πιο ευελεικτο
        boolean isInserted = false;
        if (contacts.length != 3) return;

        try {
            isInserted = insertContacts(contacts[0],contacts[1],contacts[2]);
            if (!isInserted) {
                throw new Exception("Phone already exists");
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    public static void updatetContactService(String... contacts) throws Exception {       //  varargs ... σαν μορφη πινακα αλλα πιο ευελεικτο
        boolean isUpdated = false;
        if (contacts.length != 3) return;

        try {
            isUpdated = insertContacts(contacts[0],contacts[1],contacts[2]);
            if (!isUpdated) {
                throw new Exception("Contact Not Found");
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    public static void deleteContactService(String phoneNumber) throws Exception {
        boolean isDeleted = false;

        try {
            isDeleted = deleteContact(phoneNumber);
            if (!isDeleted) {
                throw new Exception("Contact not exists");
            }

        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }




    /*
     * CRUD Method - CRUD Layer
     */

    /**
     *
     * @param phoneNumber
     * @return
     */

    public static int getContactIndexByPhoneNumber(String phoneNumber) {
        for (int i = 0; i <= pivot; i++) {
            if (contacts[i][2].equals(phoneNumber)) {
                return i;
            }
        }
        return -1;
    }

    public static boolean isFull(String[][] contacts) {
        return (pivot == contacts.length -1);
    }
    public static boolean insertContacts(String firstName, String lastName, String phoneNumber) {
        boolean inserted = false;

        if (isFull(contacts)) return false;
        if (getContactIndexByPhoneNumber(phoneNumber) != -1) {
            return false;
        }
        pivot++;
        contacts[pivot][0] = firstName;
        contacts[pivot][1] = lastName;
        contacts[pivot][2] = phoneNumber;
        return true;
    }

    public static boolean updateContact(String firstName, String lastName, String phoneNumber) {
        int positionToUpdate = getContactIndexByPhoneNumber(phoneNumber);

        if (positionToUpdate == -1) {
            return false;
        }
        contacts[positionToUpdate][0] = firstName;
        contacts[positionToUpdate][1] = lastName;
        return true;
    }

    public static boolean deleteContact(String phoneNumber) {
        int positionToDelete = getContactIndexByPhoneNumber(phoneNumber);

        if (positionToDelete == -1) {
            return false;
        }

        System.arraycopy(contacts, positionToDelete + 1, contacts, positionToDelete, pivot - positionToDelete );
        pivot--;
        return true;
    }

    public static String[] getByPhoneNumber(String phoneNumber) {
        int position = getContactIndexByPhoneNumber(phoneNumber);

        return (position == -1) ? new String[] {} : contacts[position];  // new String[] {} σημαίνει κενό στρινγκ
    }

    public static String[][] getAllContacts() {
        return Arrays.copyOf(contacts, pivot +1);
    }
}
