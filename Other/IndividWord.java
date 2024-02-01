package Other;

public class IndividWord{
static void individualWord(String sentence){
    String words[]=sentence.split(" ");
    for(String a : words)
    {
        System.out.println(a);
    }
}}
