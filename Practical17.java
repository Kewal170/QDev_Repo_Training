/**
 * Practical 17: Write a program to demonstrate the interface. 
 */
interface Shape {

    /**
     * Method to calculate area of a shape.
     *
     * @return area of the shape
     */
    double area();
}

class Circle implements Shape {
    private double radius;

    /**
     * Constructor to initialize radius of the circle.
     *
     * @param radius radius of the circle
     */
    Circle(double radius) {
        this.radius = radius;
    }

    /**
     * Calculates area of the circle.
     *
     * @return area of the circle
     */
    @Override
    public double area() {
        return 3.14159 * radius * radius;
    }

}

public class Practical17 {

    public static void main(String[] args) {
        Circle circle = new Circle(45);

        // Display area with 2 decimal precision
        System.out.printf("Area of Circle : %.2f%n", circle.area());
    }

}
