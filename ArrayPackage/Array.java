package ArrayPackage;

public class Array {    public static void main(String[] args){


    int[] array = {1,2,3,4,5,6,7,8};

    //in  order to search an element in an array, we have to use for loop


    for(int i = 0; i<array.length;i++)
    {
        if(array[i]==12)
        {
            System.out.println("The index of the 6 in this array is " + i);
            System.exit(0);
        }

    }

    System.out.println("ELEMENT NOT FOUND");

    System.out.println("" );
}
}
