/**
 * This work is marked with CC0 1.0 Universal
 */
package shapes;

/**
 * Class to represent an Equilateral Triangle shape - contains 3 sides of equal length and
 * contains 3 vertices
 */

public class EquilateralTriangle extends Shape2D {
    private double sideLength;


    /**
    * Constructor for Equilateral Triangle  shape object
    * @param centre The centre of the Equilateral Triangle represented as a Point object
    * @param sideLength The length of each side (all same as equilateral)
    */
    public EquilateralTriangle(Point centre, double sideLength) {


    }


    @Override
    public double getArea() {

        double area = (Math.sqrt(3) / 4) * Math.pow(sideLength, 2);
        return area;

    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public Point[] GetVertices() {
        return new Point[0];
    }

    @Override
    public void translate(double x, double y) {

    }

    @Override
    public boolean containsPoint(Point point) {
        return false;
    }
}
