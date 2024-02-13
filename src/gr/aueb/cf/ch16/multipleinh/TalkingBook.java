package gr.aueb.cf.ch16.multipleinh;

public class TalkingBook implements ITalking {
    @Override
    public void read() {
        System.out.println("can read");
    }

    @Override
    public void speak() {
        System.out.println("can speak");
    }
}
