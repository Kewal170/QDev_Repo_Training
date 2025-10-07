interface Shape {
    double area();
}

class Circle implements Shape{
    private double radius;

    Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double area(){
        return 3.14159 * radius * radius;
    }
}

public class Practical17 {
    public static void main(String[] args) {
        Circle circle = new Circle(45);
        System.out.printf("Area of Circle : %.2f\n", circle.area());
    }    
}
