package gr.aueb.cf.ch14;

/**
 * Η Point2D Περιλαμβάνει την Point και την επεκτείνει.
 */


public class Point2D extends Point {

    private double y;

    public  Point2D() {
        super(); //Το super είναι ένας δείκτης που δείχνει στον parent Instance | Καλεί τον default constructor  της Point
        y = 0;
    }


    public Point2D(double x, double y) {
        super(x); //Καλεί τον υπερφορτωμένο constructor της Point
        this.y = y;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }


    @Override
    public String toString() {
        return super.pointToString() + "(" + y + ")";
    }

    //Liskov substitution principle
    @Override
    public String pointToString() {
        return super.pointToString() + "(" + y + ")";
    }

    @Override
    public void movePlus() {
        super.movePlus();
        y +=10;
    }

    @Override
    protected void movePlusOne() {
        super.movePlusOne();
        y +=1;
    }
}
