package Other;

import java.util.Scanner;

import static Other.IndividWord.individualWord;

public class PrintingEachWordinEachLine{
public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Give a sentence, the words will be printed on separate lines: ");
        String Para = input.nextLine();

        invidWord.individualWord(Para);
    }


    public class invidWord {

        static void individualWord(String sentence) {
            String words[] = sentence.split(" ");
            for(String a : words) {
                System.out.println(a);
            }
        }}}