package Other;

import java.util.Arrays;

public class AvgAndMaxArray {public static void main(String[] args){
int number = 25;
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

