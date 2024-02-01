package Assignments;

import java.util.Scanner;

public class Assignment3_3 { public static void main(String[] args){


    Scanner input = new Scanner(System.in);
    System.out.print("Input 1st number: ");
    int number1 = input.nextInt();
    System.out.print("Input 2nd number: ");
    int number2 = input.nextInt();
    System.out.print("Input 3rd number: ");
    int number3 = input.nextInt();
    System.out.print("Input 4th number: ");
    int number4 = input.nextInt();

    if(number1==number2 && number2==number3 && number3==number4 && number4==number1)
            System.out.println("All the numbers are equal");
        else
            System.out.println("Numbers are not equal");



}
}
