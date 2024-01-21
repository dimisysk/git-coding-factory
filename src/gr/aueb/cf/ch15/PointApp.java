package gr.aueb.cf.ch15;

public class PointApp {
    public static void main(String[] args) {
        Point p = new Point();
        Point p2 = new Point2D();
        Point p3 = new Point3D();

        p2.movePlus1();

        p3.movePlus10();

        ((Point2D)p2).setY(5);

        System.out.println(p2.toString());


        doMovePlus10(p);
        doMovePlus10(p3);
        doMovePlus10(p2);

        doPrint(p);
        doPrint(p2);
        doPrint(p3);
    }



    public static void doMovePlus10(Point point) {
        point.movePlus10();

    }

    public static void doPrint(Point point) {
        System.out.println(point);
    }
}
