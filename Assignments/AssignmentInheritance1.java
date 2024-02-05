package Assignments;
/*Write a Java program to create a class called Vehicle with a method called drive().
Create a subclass called Car that overrides the drive() method to print "Repairing a car".*/


class Vehicle {
    public void drive() {
        System.out.println("Driving a vehicle");
    }
}

class Car extends Vehicle {
    @Override
    public void drive() {
        System.out.println("Repairing a car");
    }
}
public class AssignmentInheritance1 {
    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle();
        //vehicle.drive(); if we want to check you can print this

        Car Honda = new Car();
        Honda.drive();
    }
}