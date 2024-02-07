package Other;

import java.util.Scanner;

public class throwandthrows {

    static void methodMultiplication(int number){
        for(int i =1;i<=10;i++){

            System.out.println(number+" X "+i+" = "+ (number*i));
        }
    }



    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Give me a number to print the multiplication table: ");
        int num = input.nextInt();

        methodMultiplication(num);








}
}
