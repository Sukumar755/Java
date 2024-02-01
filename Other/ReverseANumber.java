package Other;

import java.util.Scanner;

public class ReverseANumber {public static void main(String[] args){

    Scanner input = new Scanner(System.in);
    System.out.print("                give me a number to reverse it: ");
    int actualNumber;
    int number =actualNumber= input.nextInt();/* just putting the given number
    in another variable so that we can use it in the end of the program*/
    int remainder;

    int reverse=0;

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
        reverse = reverse*10+remainder;

    }
    System.out.println("the reverse of the "+actualNumber+ " is "+ reverse);
}
}
