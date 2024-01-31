package gr.aueb.cf.ch15;

public class PointsDemo {
    private final static Point[] points;
    private static int pointsCount = 0;
    private static int points2DCounts = 0;
    private static int points3DCounts = 0;

    static {
        points = new Point[] {
                new Point(1),new Point2D(2,3),new Point2D(4,5),new Point3D(2,3,5),
                new Point3D(2,4,7)
        };
    }
    public static void main(String[] args) {
        for (Point point : points) {
            point.printTypeOf();

            if (point instanceof Point3D) {
                points3DCounts++;
            } else if (point instanceof Point2D) {
                points2DCounts++;
            } else {
                pointsCount++;
            }
        }
        System.out.println("Point instances: " + pointsCount);
        System.out.println("Point2D instances: " + points2DCounts);
        System.out.println("Point3D instances: " + points3DCounts);
    }
}
