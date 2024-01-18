package gr.aueb.cf.ch11;

import java.util.Scanner;

/**
 * Student JavaBean
 * Data Class + default constructor + setter / getters
 */
public class Student {
    private static int instancesCount ;
    private int id;
    private String firstname;
    private String lastname;
    private static Scanner in;

    static {
        in = new Scanner(System.in);
        int num = in.nextInt();
        instancesCount = (num == 1) ? 1 : 0;
    }

    public Student() {
        instancesCount++;
    }

    // default constructor
//    public Student() {
//        id =0;                    // default constructor   //  αν δηλώσουμε τον Overloaded και θελουμε και τον default τοτε πρεπει να τον δηλωσουμε και τν default
//        firstname = null;
//        lastname = null;
//    }

    // Overloaded constructor
    public Student(int id, String firstname, String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getLastname() {
        return lastname;
    }

    public static int getInstancesCount() {
        return instancesCount;
    }
}
