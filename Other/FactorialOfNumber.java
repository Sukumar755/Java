package Other;

import java.util.Scanner;

public class FactorialOfNumber {    public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    System.out.print("GIve me a number to get the factorial: ");
    int number = input.nextInt();
    int factorial = 1;
    for(int i =1;i<=number;i++)
    {
        factorial = factorial * i;
    }

    System.out.println("The factorial of "+number+" is: "+ factorial);
}
}
