package Other;



   public class multithreading2 implements Runnable{
       public void run() {
           int i = 1;
           while (i < 100) {
               System.out.println(i + " hello");
               i++;
           }
       }

public static void main(String[] args){

      multithreading2 m = new multithreading2();
      Thread t = new Thread(m);
      t.start();



        int j=0;
        while(j<100){
            System.out.println(j+ " world");
            j++;
        }



}
}
