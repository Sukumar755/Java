package ArrayPackage;

public class FindingSecondMax {public static void main(String[] args){

    int[] numbers= {1,2,3,4,5,6,7,8};
    int max2;
int max1= max2 =numbers[0];

for(int i =0; i<numbers.length;i++)
{
    if(numbers[i]>max1){

        max2=max1;
        max1 = numbers[i];
    }

}
    System.out.println("The second max element in the array is "+max2);
}


}
