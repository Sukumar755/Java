package ArrayPackage;

import java.util.Arrays;

public class RightRotatingElementsInArray {
    public static void main(String[] args){

        int[] numbers = {1,2,3,4,5};

        int last_number = numbers[numbers.length-1];

        for(int i =numbers.length-2;i>=0;i--)
        {
            numbers[i+1]=numbers[i];
        }

        numbers[0]=last_number;

        System.out.println(Arrays.toString(numbers));

//        for(int x: numbers)
//        {
//            System.out.print(x+ " ");
//        }
    }
}
