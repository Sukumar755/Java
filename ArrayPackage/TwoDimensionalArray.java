package ArrayPackage;

import java.util.Arrays;

public class TwoDimensionalArray { public static void main(String[] args){

    int[][] numbers = {{1,2,3,4},{2,4,6,8},{1,3,5,7}};

    System.out.println("This is using normal for loop");
    for(int i =0;i<numbers.length;i++)
    {
        for(int j =0;j<numbers[0].length;j++)
        {
            System.out.print(numbers[i][j]+" ");
        }
        System.out.println();
    }




    //or we can do for each loop
    System.out.println("This is using  FOR EACH loop");
    for(int x[]:numbers)
    {
        for(int y: x)
        {
            System.out.print(y+" ");
        }
        System.out.println();
    }

    System.out.println("\n"+"we get the same result.");


    System.out.println(Arrays.toString(numbers));
}
}
