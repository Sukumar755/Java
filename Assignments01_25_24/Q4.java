package Assignments01_25_24;
//WAP to check whether the give number is prime number or not
import java.util.Scanner;

//* Simple rule, number cannot be divided by another number except 1 and itself,
// so its better to start the loop from 2 and loop untill its less than number/2, we use number/2 because for example if you take 24 it is
// only divided by number less than its half, for ex:2,4,6,8,12.*/


public class Q4 { public static void main(String[] args){



    Scanner input = new Scanner(System.in);
    System.out.print("Give a number: ");
    int number = input.nextInt();
    boolean isPrime=true;

    for(int i =2;i<=number/2;i++) {
        if(number%i==0)
            { isPrime = false;
                break;}
    }

        if(isPrime==true)
            System.out.println(number+" is a prime number");
        else
            System.out.println(number+" is not a prime number");



    }}


