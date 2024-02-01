package Assignments;

import java.util.Scanner;

public class Assignment3_2 { public static void main(String[] args)
{
    Scanner input = new Scanner(System.in);
    System.out.print("Give me a number: ");

    int number = input.nextInt();

    int square = number*number;
    int cube = number*number*number;
    int fourthPower = number*number*number*number;


    System.out.println("* Square of "+number+ " is "+ square);
    System.out.println("* Cube of "+number+ " is "+ cube);
    System.out.println("* The fourth power of "+number+ " is "+ fourthPower);
}
}
