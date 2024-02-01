package Other;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseNumANDArrayMethodOverloading {

    //REVERSE A NUMBER
    //REVERSE AN ARRAY
    //DO METHOD OVERLOADING

//method using the name Reverse
    static int Reverse(int number)
    {
        int reverse=0;
        int remainder;
        while(number>0)
        {
            remainder = number%10;
            number=number/10;
            reverse = reverse*10+remainder;

        }

        return reverse;

    }







    //another method using the same name

        static void Reverse(int x[])
        {
         int reverseArray[]= new int[x.length];

            for(int i =0;i<x.length;i++)
            {
                reverseArray[i]=x[(x.length-1)-i];
            }

            System.out.println(Arrays.toString(reverseArray));
        }








    public static void main(String[] args)
    {

        int number = 123;

        int[] numbers ={1,2,3,4,5};

        System.out.println(Reverse(number));

        Reverse(numbers);


    }

}
