package gr.aueb.cf.ch14.immutable;

public class Public3DImmutable extends immutablePoint {
    private final immutablePoint immutablePoint;
    private final int z;

    public Public3DImmutable () {
        immutablePoint = new immutablePoint();
        z=0;
    }

    public Public3DImmutable(immutablePoint immutablePoint , int z) {
        this.immutablePoint = immutablePoint;
        this.z = z;
    }

    public immutablePoint getImmutablePoint() {
        return immutablePoint;
    }

    public int getZ () {
        return z;
    }
}
