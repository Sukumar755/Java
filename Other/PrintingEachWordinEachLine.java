package Other;

import java.util.Arrays;
import java.util.Scanner;

public class PrintingEachWordinEachLine {public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.print("Give a sentence, the words will be printed in seperate line: ");
    String sentence = input.nextLine();

    String words[]=sentence.split(" ");

   for(int i =0;i< words.length;i++) {
       System.out.println(words[i]);
   }



}
}
