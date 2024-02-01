package Assignments;


class Printing{

    private String str;

    public Printing(){
        System.out.println("Hi, this is a message from non-parametersied constructor");
    }

    public Printing(String str){
        System.out.println(str);

    }
}

public class PrintUsingClass {public static void main(String[] args){

    Printing p1 = new Printing();
    Printing p2= new Printing("This is using parameterised constructor");




}
}
