package Other;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Except2 { public static void main(String[] args){

    Scanner input = new Scanner(System.in);
    System.out.print("a: ");
    try{
        int a = input.nextInt();
        System.out.print("b: ");
        int b = input.nextInt();
        int[]x={1,0,2,3,4};

        try{ int d = a/b;
            System.out.println(d);}
        catch(ArithmeticException e) {

            System.out.println("zero kind pettaku ra ayya");
        }

        int c =x[4]/x[2];


    System.out.println(c);
    }




    catch(IndexOutOfBoundsException z){
        System.out.println("Check the length of the array");
    }

    catch(InputMismatchException e){
        System.out.println("You should only give integers");
    }

    System.out.println("bye");






}
}
