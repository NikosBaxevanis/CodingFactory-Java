package gr.aueb.cf.ch16.interfaces.skeletal2;

public class AbstractRectangle  implements IRectangle {


    private double width;
    private double height;

    public AbstractRectangle () {
        
    }
    public AbstractRectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }



    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public boolean isSquare() {
        return width == height;
    }
}
