package gr.aueb.cf.ch16.products;

public class Main {

    public static void main(String[] args) {
        Milk myMilk = new Milk(1,"MyMilk","Light Milk", 1.25,3,"Milko");
        Milk milk2 = myMilk.get();

        System.out.println(milk2.getProductName());
        System.out.println(myMilk.getPrice());
    }
}
