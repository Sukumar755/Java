package Assignments;

import java.util.Scanner;

public class Assignment3_1 { public static void main(String[] args)
{
    Scanner input = new Scanner(System.in);

    System.out.print("I'm gonna convert inches to meters, so give me the number of inches: ");

    double inches = input.nextDouble();

    double meters = inches/39.3701;

    System.out.println("So "+inches+" inches is equal to "+meters+" meters");
}
}
