package Other;

public class MethodMaxElement {

    static int findMax(int x[]){
        int max = x[0];

        for(int i =0;i<x.length;i++)
        {
            if(x[i]>max)
                max = x[i];
        }

        return max;
    }

    public static void main(String[] args){

        int [] numbers = {23,34,323,12,323,545,7654};

        System.out.println("the maximum element in the array is "+findMax(numbers));




}
}
