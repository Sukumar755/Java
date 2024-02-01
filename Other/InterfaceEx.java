package Other;

import java.sql.SQLOutput;

interface I1{
   int VARIABLE = 10;
    void meth1();
    void meth2();
    default void meth3(){};

}

class My implements I1{
    public void meth1(){};
    public void meth2(){}


}

public class InterfaceEx {public static void main(String[] args){
    System.out.println(I1.VARIABLE);
    My m = new My();




}
}
