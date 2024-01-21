package gr.aueb.cf.ch14;

/**
 * Singleton Design Pattern.
 */

public class CodingFacory {
    private static final CodingFacory INSTANCE = new CodingFacory();

    private CodingFacory() {

    }

    public static CodingFacory getInstance() {
        return INSTANCE;
    }

    public void sayHi(String message) {
        System.out.println(message);
    }
}
