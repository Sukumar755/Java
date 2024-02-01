package Assignments;

import java.util.Arrays;

public class Assignment1_1 { public static void main(String[] args)
{

    String personName = "Sukumar";
    char gender = 'M';
    int age = 28;
    boolean isStudent = true;
    double salaryExpecting = 90000.00;

    System.out.println("Name: " + personName);
    System.out.println("Gender: " + gender);
    System.out.println("Age: " + age);
    System.out.println("Employed: " + isStudent);
    System.out.println("Salary: " + salaryExpecting+"\n");



    //this is for the printing first names and last names from an array of names
String[] students={"Raj Kumar","Sukumar Akoju","Rohith Vanda","Sravani Karunanidhi","Sravan Kumar","Ajay Chandra"};
System.out.println("Given names in the array are: "+Arrays.toString(students)+"\n");

String[] firstNames = new String[students.length];
String[] lastNames = new String[students.length];

for(int i =0;i< students.length;i++)
{
String[] example = students[i].split(" ");
firstNames[i]=example[0];
lastNames[i]=example[1];

};

System.out.print("First names: {");

for(int i =0;i<students.length;i++)
{
    System.out.print(firstNames[i]+",");

}


System.out.print("}"+"\n"+"Last names: {");
for(int i =0;i< students.length;i++)
{
    System.out.print(lastNames[i]+ ",");
}

System.out.print("}");



}
}
