package Other;

import java.util.Scanner;

public class Fibonaci { public static void main(String[] args){

    Scanner input = new Scanner(System.in);
    System.out.print("how many numbers do you want to print in fibonaci series: ");
    int count = input.nextInt();

    int firstNumber = 0;  // in fibonaci series 1st number is always 0

    int secondNumber = 1; // and second number is always 1;

    // add these we will get the third number, in this fashion we can get the numbers further.

    System.out.print(firstNumber+","+secondNumber+ ",");/* we have to print this outside
     the loop because, its only needed to print once
      and then other numbers will come after the addition*/

    for(int i =0;i<count-2;i++){ // here the i < count-2 because, first and second number is already printed.
        int thirdNumber = firstNumber+secondNumber;

        System.out.print(thirdNumber+ ",");
      firstNumber=secondNumber;
      secondNumber=thirdNumber;// by doing this, this loop will continue,


    }
}
}
