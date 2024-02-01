package Other;

import java.util.Scanner;

class StudentRegister{
    public int rollNumber;
    public String name;
    public String course;
    public int marks1,marks2,marks3;

    public int totalMarks(int marks1,int marks2,int marks3){
        return marks1+marks2+marks3;
    }
    public int totalMarks(){
        return marks1+marks2+marks3;
    }
    public double averageMarks(){
        return totalMarks()/3;
    }

    public void grade(){
        if(averageMarks()>20)
            System.out.println("Grade A");
        else
            System.out.println("Grade B");

    }
}
public class Student {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        StudentRegister S = new StudentRegister();

        System.out.print("Whats the name of the Student: ");
        S.name = input.nextLine();

        System.out.print("Whats the roll number of the student: ");
        S.rollNumber = input.nextInt();



        System.out.print("Subject1 marks: ");
        S.marks1 = input.nextInt();
        System.out.print("Subject2 marks: ");
        S.marks2 = input.nextInt();
        System.out.print("Subject3 marks: ");
        S.marks3 = input.nextInt();

        System.out.println("The name of the student is "+S.name);
        System.out.println("Subject 1 marks are "+S.marks1);
        System.out.println("Subject 2 marks are "+S.marks2);
        System.out.println("Subject 3 marks are "+S.marks3);


        System.out.println("Total marks: "+ S.totalMarks());
        System.out.println("Average marks: "+ S.averageMarks());
        S.grade();

    }
}
