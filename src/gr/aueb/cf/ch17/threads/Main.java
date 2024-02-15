package gr.aueb.cf.ch17.threads;

import gr.aueb.cf.ch17.knight.IPrincess;
import gr.aueb.cf.ch17.knight.Princess;

public class Main {

    private final static Runnable jim = new knight("Sir Jim");
    private final static Runnable george = new knight("Sir George");
//    private final static Runnable john = new knight("Sir John");

    public static void main(String[] args) {
        (new Thread(jim)).start();
        (new Thread(george)).start();
//        (new Thread(john)).start();
    }

}
