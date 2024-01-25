package StriverDSA;

public class AreaCalculator {
    // Function to calculate the area of a circle
    public double area1(double radius) {
        return Math.PI * radius * radius;
    }

    // Function to calculate the area of a triangle
    public double area1(double base, double height) {
        return 0.5 * base * height;
    }

    // Function to calculate the area of a square
    public double area(double sideLength) {
        return sideLength * sideLength;
    }

    // Function to calculate the area of a rectangle
    public double area(double length, double width) {
        return width * length;
    }

    public static void main(String[] args) {
        AreaCalculator calculator = new AreaCalculator();
        System.out.println("Area of Circle is " + calculator.area1(5.0));
        System.out.println("Area of Triangle is " + calculator.area1(5.0, 7.0));
        System.out.println("Area of Square is " + calculator.area1(5.9));
        System.out.println("Area of Rectangle is " + calculator.area1(5.9, 9.3));
    }
}
