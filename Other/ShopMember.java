package Other;


interface Member { void callMethod(); }

class Customer1 implements Member {
    String name;

    public void callMethod(){
        System.out.println("Yes I am okay to recieve the call");}
    public Customer1(String name){
        this.name = name;}
}

class Shop{

    Member mem[]= new Member[10];
    int count =0;

    void memberRegister(Member m){

        mem[count++]=m;
    }

    void saleInvite(){

        for(int i =0;i< count;i++){

            mem[i].callMethod();
        }
    }

}

public class ShopMember {public static void main(String[] args){



    Shop s = new Shop();
    Customer1 c = new Customer1("Raj");
    Customer1 c2 = new Customer1("Kumar");


    s.memberRegister(c);
    s.memberRegister(c2);

    s.saleInvite();



}
}
