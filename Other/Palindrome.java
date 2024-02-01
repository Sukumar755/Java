package Other;

import java.util.Scanner;

public class Palindrome {public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    System.out.print("Give me a number to check if its a palindrome number: ");

    int number = input.nextInt();
    /*store this number in another variable to compare with the result,
    because the variable number will be changed at the end because of the loop */

    int actualNumber = number;
    int remainder;
    int reverse = 0;

    //in order to check, we have to find the reverse of the number.
    // for this we have to get the remainder by dividing it with 10 and store it in remainder variable.
    // then divide the number by 10 and store in the variable number.
    // for the reverse , we have to do reverse*10+ remainder
    //take int reverse = 0;
    // so reverse = (reverse*10)+ remainder
    //if you use this above formula, we can get the reverse

    while(number>0)
    {
        remainder = number%10;
        number = number/10;

        reverse = reverse*10+ remainder;
    }
   // System.out.println(reverse); I typed this to check the reverse while debugging.
    if(reverse==actualNumber)
    {
        System.out.println(actualNumber+" is a palindrome");
    }
    else
        System.out.println(actualNumber+ " is not a palindrome ");
    }
}
