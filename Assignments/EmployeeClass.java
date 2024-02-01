package Assignments;


class Employee{



    private String employeeName;
    private String jobTitle;
    private double salary;

    public String getEmployeeName(){return employeeName;}
    public String getJobTitle(){return jobTitle;}
    public double getSalary(){return salary;}




    public void setEmployeeName(String name){this.employeeName=name;}
    public void setJobTitle(String title){this.jobTitle=title;}
    public void setSalary(double salary){this.salary=salary;}



    public void update_Salary_Increment_by_Percentage(double percentage){salary+= (salary/100)*percentage;
        System.out.println("Updated salary by "+percentage+" percentage and present salary is "+ getSalary());}

    public void displayEmployeeInfo(){
        System.out.println("Employee name: "+getEmployeeName()+"\nEmployee Designation: "+getJobTitle()+"\nSalary: "+getSalary());
    }

}
public class EmployeeClass {
    public static void main(String[] args) {

        Employee emp1 = new Employee();

        emp1.setEmployeeName("Sukumar");
        emp1.setJobTitle("Java Developer");
        emp1.setSalary(90000);



        emp1.displayEmployeeInfo();
        emp1.update_Salary_Increment_by_Percentage(5);
    }
}
