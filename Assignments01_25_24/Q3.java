package Assignments01_25_24;
//3. Write a program to return the sum of first 10 even number and odd numbers
public class Q3 { public static void main(String[] args){
    int count1=1;
    int even;
    int sum1 =0;
    int odd;
    int sum2=0;
    int count2=1;

    for(int i =1;count1<=10 || count2<=10;i++){

        if(i%2==0)
        {   even=i;
            sum1= sum1+even;
            count1++;}

        if(i%2==1){
            odd=i;
            sum2=odd+sum2;
            count2++;
        }
    }
    System.out.println("The sum of the first ten even numbers is "+sum1);
    System.out.println("The sum of the first ten odd numbers is "+sum2);
}


}
