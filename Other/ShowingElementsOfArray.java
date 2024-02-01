package Other;

public class ShowingElementsOfArray {

    public  static void max(int... x)
    {
    int max = x[0];

        for( int i =0;i<x.length;i++)
        {
            if(x[i]>max)
            {
               max=x[i];
            }
        }
        System.out.println("The maximum number in the array: "+ max);
    }


    public static void main(String [] args){

        max(1,2,3,4,5,6,7,8,9,34,56,75,40,37);
        max(300,35);
    }
}
