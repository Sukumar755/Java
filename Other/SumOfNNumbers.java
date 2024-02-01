package Other;

import java.util.Scanner;

public class SumOfNNumbers { public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    System.out.print("How many integers do you want me to add?: ");

    int count = input.nextInt();

    int sum = 0;


    for(int i = 1; i<=count;i++)

    {
        System.out.println("give me the integer no."+i+": ");

        int integer = input.nextInt();

        sum = sum + integer;  // or we can write sum+= integer;


    }

    System.out.println("The total sum of the "+ count+ " integers you've given is : "+ sum);
}
}
