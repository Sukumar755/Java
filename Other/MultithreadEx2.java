package Other;

public class MultithreadEx2 extends Thread{

    public void run(){
        int i =1;
        while(i<100){
            System.out.print(i+"helo ");
            i++;
        }
    }

    public static void main(String[] args){
        MultithreadEx2 m = new MultithreadEx2();
        m.start();
        int i =1;
        while(i<100){
            System.out.print(i+ " world ");
            i++;
        }
    }
}
