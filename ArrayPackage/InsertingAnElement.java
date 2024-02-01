package ArrayPackage;

import java.util.Arrays;

public class InsertingAnElement {public static void main(String[] args){

    int[] numbers = new int[10];

    numbers[0]=5;
    numbers[1]=9;
    numbers[2]=6;
    numbers[3]=10;
    numbers[4]=12;
    numbers[5]=7;

    System.out.println(Arrays.toString(numbers));

    for(int i=6;i>2;i--)
        ///* n =6; index =2; we can also write for(int i = n; i<index;i--)
        // here n is the place where we want to start shifting, index is the place we want to insert an element
        // [5, 9, 6, 10, 12, 7, 0, 0, 0, 0]*// /
    {

        numbers[i]=numbers[i-1];
    }
    numbers[2]=15;
    System.out.println(Arrays.toString(numbers));
}
}
