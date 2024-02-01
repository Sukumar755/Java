package Assignments;

import java.util.Scanner;

public class StringtoIntegerAndIntToString {public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.print("Give and integer: ");
    int number = input.nextInt();

    String str = String.valueOf(number);

    System.out.println("Integer converted to string: "+str);

    System.out.print("Give a string: ");
    String str1 = input.next();

    int number1 = Integer.valueOf(str1);

    System.out.println("String converted to integer: "+number1);
}
}
