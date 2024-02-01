package Assignments;

import java.util.Scanner;

public class DoubleToString {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Give me a double value: ");
        double number = input.nextDouble();

        String str = String.valueOf(number);
        System.out.println("Converted to string: "+str);



    }
}
