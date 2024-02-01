package Other;

import java.util.Scanner;

public class CountTheDigitsInANumber {

    static void Count(int number)// this is the method I created to count the digits of a given number.
    {
        int count = 0;
        while(number>0)
        {
            number =number/10;
            count++;

        }
        System.out.println("the count is "+ count);
    }



    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Give me a number and I can count the digits in it: ");
        int number = input.nextInt();

        Count(number);



    }
}
