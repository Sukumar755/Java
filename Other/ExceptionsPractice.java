package Other;
import java.util.Scanner;
class ExceptionsPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Give the value of b: ");

            int a = 5;
        try{  int b = input.nextInt();

            System.out.println(a/b);}
        catch(ArithmeticException e) {
            System.out.println("Do not give zero ");
        }
    }}