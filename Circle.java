import java.math.*;
class Circle {
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println("Area of circle with radius 5  : " + circle.getArea());
        System.out.println("Circumference of circle with radius 5  :" + circle.getCircumference());
    }
}

//Area of circle with radius 5  : 78.53981633974483
//Circumference of circle with radius 5  :31.41592653589793