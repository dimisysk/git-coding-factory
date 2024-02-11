package gr.aueb.cf.ch16.marker;

public class Main {

    public static void main(String[] args) {
        Item book = new Book(1,"123","Smith","Capital");
        Item cd = new CompactDisk(1,"white collars");

        deliver(book);
        deliver(cd);
    }

    public static void deliver(Item item) {
        if (item instanceof Book) {
            System.out.println("Book was delivered.");
        } else if (item instanceof CompactDisk) {
            System.out.println("CD was delivered.");
        } else {
            throw new RuntimeException()
        }
    }
}
