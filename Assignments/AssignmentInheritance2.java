package Assignments;
/*2. Write a Java program to create a class called Employee with methods called work() and getSalary().
Create a subclass called HRManager that overrides the work() method and adds a new method called addEmployee().*/

class Employee {
    private double salary;

    public Employee(){

    }
    public Employee(double salary) {
        this.salary = salary;
    }

    public void work() {
        System.out.println("Employee is working");
    }

    public double getSalary() {
        return salary;
    }
}

class HRManager extends Employee {


    @Override
    public void work() {
        System.out.println("HR manager has given a work to employee");
    }

    public void addEmployee() {
        System.out.println("HR Manager is adding a new employee");

    }
}

public class AssignmentInheritance2 {
    public static void main(String[] args) {

        Employee employee = new Employee(50000);
        employee.work();
        System.out.println("Salary: " + employee.getSalary());

        System.out.println("\nHR Manager: \n");
        HRManager hrManager = new HRManager();
        hrManager.work();

        hrManager.addEmployee(); // Output: HR Manager is adding a new employee
    }
}