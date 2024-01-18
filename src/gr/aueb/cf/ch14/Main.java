package gr.aueb.cf.ch14;

public class Main {

    public static void main(String[] args) {
        CodingFacory codingFacory = CodingFacory.getInstance();
        CodingFacory codingFacory2 = CodingFacory.getInstance();
        codingFacory.sayHi("Hello CF");
    }
}
