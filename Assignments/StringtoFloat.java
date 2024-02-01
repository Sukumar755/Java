package Assignments;


import java.util.Scanner;

public class StringtoFloat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Give a string: ");
        String str = input.next();

        float number = Float.valueOf(str);
        System.out.println("Converted: "+number);
    }
}
