package Other;
interface int1{
    void meth1();
    void meth2();
}

class Normal implements int1{
    public void meth1(){

    }
    public void meth2(){

    }
}

public class InterfacePractice {public static void main(String[] args){

    int1 a = new Normal();

a.meth1();

}
}
