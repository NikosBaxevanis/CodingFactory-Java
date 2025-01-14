package gr.aueb.cf.ch14;

public class PointMain {
    public static void main(String[] args) {
        Point point = new Point();
        Point2D point2D = new Point2D();
        Point3D point3D = new Point3D();

        doMovePlus10(point);
        doMovePlus10(point2D);
        doMovePlus10(point3D);

        Point p1 = new Point();
        Point p2 = new Point2D();
        Point p3 = new Point3D();


        p3.movePlus();

      //  ((Point2D) P2).setY(15); //downcast , αφού η point δεν έχει την setY
    }

    public static void doMovePlus10 (Point point) {
        point.movePlus();
    }

    public static void doPrint(Point point) {
        System.out.println(point.pointToString());
    }
}
