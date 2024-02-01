package Other;

import java.util.Scanner;

public class Displaydigits
{public static void main(String[] args){

    //display digits 234
    Scanner input = new Scanner(System.in);
    System.out.print("give me a number to display the digits: ");

    int number = input.nextInt();
    int remainder = 0;

    while(number > 0){
        remainder = number%10;
        number = number/10;
        System.out.println(remainder);


    }
}
}
