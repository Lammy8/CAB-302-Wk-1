/**
 * This work is marked with CC0 1.0 Universal
 */
package shapes;

/**
 * Class to represent a circle shape - as this is a circle it does not
 * contain any vertices
 */

public class Circle extends Shape2D  {

    private Point centre;
    private double radius;
    /**
     * Constructor for Circle shape object
     * @param centre The centre of the circle represented as a Point object
     * @param radius The radius of the circle created
     */
    public Circle(Point centre, double radius) {
        super(centre);
        this.centre = centre;
        this.radius = radius;
    }

    public boolean containsPoint(Point point) {
        double distance = Math.sqrt(Math.pow(point.getXCord() - centre.getXCord(), 2) +
                Math.pow(point.getYCord() - centre.getYCord(), 2));
        return distance <= radius;
    }

    public Point[] GetVertices() {
        // A circle does not have vertices in the traditional sense, but we can return
        // points on the circumference at regular intervals if needed.
        // Here we return an empty array as circles are not defined by vertices.
        return new Point[0];
    }

    @Override
    public void translate(double x, double y) {
        this.centre = new Point(centre.getXCord() + x, centre.getYCord() + y);

    }

    @Override
    public double getArea() {
        return Math.PI* radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
