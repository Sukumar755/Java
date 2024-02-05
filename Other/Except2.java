package Other;

import java.util.Scanner;

public class Except2 { public static void main(String[] args){

    int a=1,b=2;



    Scanner input = new Scanner(System.in);
    System.out.print("a: ");
    a=input.nextInt();
    System.out.print("b: ");
    b=input.nextInt();

    try{ int c=a/b;

    System.out.println(c);}

    catch(ArithmeticException e){

        System.out.println("zero kind pettaku ra ayya");
    }








}
}
