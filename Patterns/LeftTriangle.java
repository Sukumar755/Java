package Patterns;

import java.util.Scanner;

public class LeftTriangle {public static void main(String[] args){


    Scanner input = new Scanner(System.in);
    System.out.print("How many rows do you want to print?: ");
    int no_of_rows = input.nextInt();

    for(int i =1;i<=no_of_rows;i++)
    {
    for(int j =1;j<=no_of_rows-i;j++)
    {
        System.out.print("  ");

    }

    for(int j = 1;j<=2*i-1;j++)
        {
            System.out.print("* ");
        }
        System.out.println();
    }


}
}
