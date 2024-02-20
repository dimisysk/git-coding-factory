package gr.aueb.cf.ch3.test;

public class Test {



    public static void main(String[] args) {

        boolean isLeap = false;
        int i = 0;

        while (i <= 2400) {
            if (((i % 4 == 0) && (i % 100 != 0)) || (i % 400 == 0)) {
                isLeap = true;
                System.out.printf("Το έτος που δώσατε ( %d ) είναι δίσεκτο\n", i);
            } else  {
                System.out.printf("Το έτος που δώσατε ( %d ) δεν είναι δίσεκτο\n ", i);
            }
            i++;

        }

    }
}