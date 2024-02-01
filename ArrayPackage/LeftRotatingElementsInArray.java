package ArrayPackage;

public class LeftRotatingElementsInArray {
public static void main(String[] args){

    int[] numbers = {1,2,3,4,5};
    int temporary = numbers[0];

    for(int i=1;i<=numbers.length-1;i++)
    {
        numbers[i-1]=numbers[i];                   //i,i-1
    }

    numbers[numbers.length-1]= temporary;

    for(int i: numbers) // This is for loop
    {
        System.out.print(i+ " ");
    }

}}
