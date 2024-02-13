package Other;
class Mythread extends Thread{
    public void run()
    {

        int i = 1;
        while(i<100)
        {
            System.out.println(i+ " hello");
            i++;
        }
    }
}
public class MultithreadExample {public static void main(String[] args){

    Mythread t1 = new Mythread();
    t1.start();

    int j =0;
    while(j<100){
        System.out.println(j+" world");
        j++;
    }

}
}
