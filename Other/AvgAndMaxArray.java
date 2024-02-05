package Other;

import java.util.Arrays;
import java.util.Scanner;

public class AvgAndMaxArray {public static void main(String[] args){

    Scanner srav = new Scanner(System.in);
    System.out.print("Give me a number: ");

int number = srav.nextInt();
int count = 0;
   String number1 = (Integer.toBinaryString(number));
    System.out.println(number1);
    char a[]=number1.toCharArray();

    System.out.println(Arrays.toString(a));
    for(int i =0;i<a.length;i++){

        if(a[i]=='0'){count++;}

    }

    System.out.println("No of bits: "+count);

    }



}

