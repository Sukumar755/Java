package ArrayPackage;

import java.util.Arrays;

public class JaggeredArray {public static void main(String[] args){
   int[][] numbers = new int[3][];

    numbers[0] = new int[2];
    numbers[1] = new int[3];
    numbers[2] = new int[4];

    for(int i = 0;i<numbers.length;i++){

        for(int j=0;j<numbers[i].length;j++)
        {
            System.out.print(numbers[i][j]+" ");
        }
        System.out.println();
    }



}
}
