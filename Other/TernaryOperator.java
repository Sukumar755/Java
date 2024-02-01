package Other;

import java.util.Arrays;
import java.util.Scanner;

class TernaryOperator{
    public static void main(String[] args){



        Scanner input = new Scanner(System.in);
        System.out.print("Give a word: ");

        String words = input.nextLine();

        char[] word=words.toCharArray();

        //fSystem.out.println(Arrays.toString(word));

    for(int i =1;i<word.length-1;i++){

        word[i]='*';
    }

        words = String.valueOf(word);

        System.out.println(words);


    }
}