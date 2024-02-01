package ArrayPackage;

public class FindingMaxElement {public static void main(String[] args){

    int[] numbers = {2,5,7,34,567,456,4456,9876};

    int max = 0;

    for(int i=0;i<numbers.length;i++)
    {
        if(numbers[i]>max){

            max = numbers[i];
        }
    }

    System.out.println("The max element in the array is "+max);
}
}
