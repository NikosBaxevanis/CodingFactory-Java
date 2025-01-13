package gr.aueb.cf.ch14.composition;

public class Point {

    private double x;

    public Point() {

    }

    public Point(double x) {
        this.x = x;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }


    public String pointToString() {
        return "(" + x + ")";
    }

    /**
     * This is an API
     */

    public void movePlus() {
        x += 10;
    }

    private void reset () {
        x = 0;
    }

    protected void movePlusOne () {
        x += 1;
    }
}
