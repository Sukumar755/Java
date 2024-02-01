package Assignments01_25_24;

import java.util.Scanner;

//1. Write a program to print 4th table using for loop
public class Q1 { public static void main(String[] args){

    Scanner input = new Scanner(System.in);
    System.out.print("Give me a number: ");
    int number = input.nextInt();
    System.out.println("\nMultiplication table of "+ number);

for(int i=1;i<=10;i++){

    System.out.println(number+ " X "+i+" = "+(number*i));
}

}
}
