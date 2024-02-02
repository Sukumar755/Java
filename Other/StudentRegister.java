package Other;

import java.util.Date;

public class StudentRegister {

    public static class Student {

        private String name;
        private String rollNo;
        private int count = 1;
        Date d = new Date();


        public void setStudentName(String name) {
            this.name = name;
        }

        public void setRollNo() {
            rollNo = "univ" + (d.getYear() + 1900) +"-"+ count;
            count++;
        }

        String getName() {
            return this.name;
        }

        String getRollNo() {
            return rollNo;
        }


        public Student(String x) {

            setStudentName(x);
            setRollNo();

        }

        @Override
        public String toString() {
            return "Student name is "+getName()+", Roll no is "+getRollNo();
        }
    }

    public static void main(String[] args) {

        Student s = new Student("Raj");

        System.out.println(s.toString());



    }

    }




