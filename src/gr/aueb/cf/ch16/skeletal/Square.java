package gr.aueb.cf.ch16.skeletal;

public class Square extends AbstractRectagle {

    public Square() {
    }

    public Square(double x, double y) {
        super(x, y);
    }

    @Override
    public String toString() {
        return "(" + getWidth() + "," + getHeight() + ")";
    }
}
