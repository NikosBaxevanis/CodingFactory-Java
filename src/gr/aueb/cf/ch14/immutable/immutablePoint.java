package gr.aueb.cf.ch14.immutable;

public class immutablePoint {
    private final int x;
    private final int y;

    public immutablePoint() {
        x=0;
        y=0;
    }

    public immutablePoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
