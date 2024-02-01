package Other;

import java.util.Scanner;

public class DisplayingWordsOfNumber_2ndMethod {

public static void main(String[] args){




        Scanner input = new Scanner(System.in);

        System.out.print("Give me a number to display it in words: ");

        int number = input.nextInt();
        int remainder;

    String numberInWords = String.valueOf(number); //this is just converting the number to string
        System.out.println(numberInWords);//321

        for(int i = 0;i<numberInWords.length();i++){

            switch (numberInWords.charAt(i)){

                case '0':
                    System.out.print("Zero ");
                    break;
                case '1':
                    System.out.print("One ");
                    break;
                case '2':
                    System.out.print("Two ");
                    break;
                case '3':
                    System.out.print("Three ");
                    break;
                case '4':
                    System.out.print("Four ");
                    break;
                case '5':
                    System.out.print("Five ");
                    break;
                case '6':
                    System.out.print("Six ");
                    break;
                case '7':
                    System.out.print("Seven ");
                    break;
                case '8':
                    System.out.print("Eight ");
                    break;
                case '9':
                    System.out.print("Nine ");
                    break;

            }

        }


    }


    }