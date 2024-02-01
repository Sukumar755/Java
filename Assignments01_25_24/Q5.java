package Assignments01_25_24;

import java.util.Scanner;

//5.WAP to find the factorial of any given number
public class Q5 { public static void main(String[] args){

    Scanner input = new Scanner(System.in);
    System.out.print("Give a number: ");
    int number = input.nextInt();
    int givenNumber=number;

    int factorial=1;

    if(number == 0){
        System.out.println("The factorial of zero is 1");
    }
else {
    for(int i = number;number>0;number--){

        factorial=factorial*number;
    }
    System.out.print("The factorial of "+givenNumber+" is "+factorial);
    }}
}
