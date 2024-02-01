package Other;

import java.util.Scanner;

public class SecondProgram {
    public static void main(String[] args){

        System.out.print("Give two numbers with operator in between (for ex: 3 + 4): ");

        Scanner x = new Scanner(System.in);

        double d1 = x.nextDouble();
        char opr = x.next().charAt(0);
        double d2 = x.nextDouble();

        if (opr == '+')
            System.out.println((int)(d1+d2));
        else if (opr == '-')
            System.out.println((int)(d1-d2));
        else if (opr == '*')
            System.out.println((int)(d1*d2));
        else if (opr == '/')
            System.out.println(d1/d2);


    }
}