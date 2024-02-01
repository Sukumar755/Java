package Other;
import java.util.Scanner;




public class RomanToInteger { public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.print("Give a roman number: ");
    String romanNumber = input.next().toUpperCase();

    if(romanNumber.matches("[I,V,X,C,L,M,D]+"))
    {
        char lettersOfArray[] = romanNumber.toCharArray();

        int letterValue =0;
        int previousValue = 0;
        int Total = 0;

        for (int i = lettersOfArray.length-1; i>=0; i--)
        {

            switch(lettersOfArray[i]){
                case 'I': letterValue = 1;break;
                case 'V': letterValue = 5;break;
                case 'X': letterValue = 10;break;
                case 'L': letterValue = 50;break;
                case 'C': letterValue = 100;break;
                case 'D': letterValue = 500;break;
                case 'M': letterValue = 1000;break;
            }


            if (letterValue < previousValue) {
                Total = Total - letterValue;
            } else {
                Total = Total + letterValue;
            }

            previousValue=letterValue;
        }

        System.out.println("The integer value of " + romanNumber + " is " + Total);
    }

    else
    {
        System.out.println("It is an invalid roman numeral");
    }

}}




