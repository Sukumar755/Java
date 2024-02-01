package Other;

import java.util.Scanner;
public class MultiplicationTable   { public static void main(String [] args){

    Scanner input = new Scanner(System.in);

    System.out.print("I can print the multiplication table of any number, please give me a number: ");
    int number = input.nextInt();

    for(int i = 1;i<=10;i++)
    {
        System.out.println(number+" X "+i+ " = " +(number*i));
    }
}}
