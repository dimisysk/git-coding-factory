package gr.aueb.cf.ch17;

public class Main {

    public static void main(String[] args) {
        Book booknetworks = new Book.Builder(1,"12345")
                .author("George")
                .title("Networkng")
                .build();

        Book javavBook = new Book.Builder(2,"123212")
                .author("Syskakis")
                .title("JAva Code")
                .build();

        System.out.println(booknetworks);
        System.out.println(javavBook);
    }
}
