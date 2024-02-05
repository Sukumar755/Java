package Assignments;

abstract class Shape {

    abstract double calculateArea();
    abstract double calculatePerimeter();
}


class Circle extends Shape {
    private double radius;


    public Circle(double radius) {
        this.radius = radius;
    }


    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }


    @Override
    double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}


class Triangle extends Shape {
    private double sideA, sideB, sideC;


    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }


    @Override
    double calculateArea() {
        // Heron's formula for calculating the area of a triangle using sides.
        double s = (sideA + sideB + sideC) / 2;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }


    @Override
    double calculatePerimeter() {
        return sideA + sideB + sideC;
    }
}


public class Asgmts020224_1 {
    public static void main(String[] args) {

        Circle C = new Circle(3.0);
        Triangle T = new Triangle(2.0, 3.0, 4.0);


        System.out.println("The Area of the circle is " + C.calculateArea());
        System.out.println("The Perimeter of the circle is " + C.calculatePerimeter());
        System.out.println();
        System.out.println("The Area of the Triangle is " + T.calculateArea());
        System.out.println("The Perimeter of the Triangle is "+ T.calculatePerimeter());
    }
}