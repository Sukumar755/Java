package Other;

import java.util.Scanner;

public class FindingArmstrong  {    public static void main(String[] args){

    Scanner input = new Scanner(System.in);
    //234
    System.out.print("Give me a number: ");
    int number = input.nextInt();
    int actualNumber = number; /*storing the original given number
                                 in another variable so that we can compare it with the
                                   result of the cube in the end of the program*/

    int remainder;
    int sumOfCube=0;
    int cube;

    while(number>0)
    {
    remainder =  number%10;
    number = number/10;
    cube= remainder*remainder*remainder;
    sumOfCube = sumOfCube+cube;
    }
    if(sumOfCube == actualNumber)
    System.out.println(actualNumber+" is an Armstrong number.");
    else
        System.out.println(actualNumber+" is not an Armstrong number.");
}}

