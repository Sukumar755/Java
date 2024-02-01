package Other;

import java.util.Scanner;

public class ArthimethicProgression {public static void main(String[] args){

    Scanner input = new Scanner(System.in);
    System.out.print("How many numbers do you want me to print: ");
    int count = input.nextInt();

    System.out.print("What is the initial number: ");
    int intialNumber;
    intialNumber = input.nextInt();

    System.out.print(" What should be the difference?: ");
    int difference = input.nextInt();



    for(int i = 0;i<count;i++){
        System.out.print(intialNumber+",");
       intialNumber =  intialNumber+difference;


    }

}
}
