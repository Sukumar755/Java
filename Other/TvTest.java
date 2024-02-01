package Other;

class TV{

    public void switchON(){System.out.println("TV is switched ON");}
    public void changeChannel(){System.out.println("Channel is changed in normal TV");}

}

class SmartTv extends TV
{
    public void switchON(){System.out.println("Smart TV is switched ON");}
    public void changeChannel(){System.out.println("Channel is changed in SmartTv");}
    public void browsing(){System.out.println("Browsing in Smart TV");}

}
public class TvTest {
    public static void main(String[] args){

        TV t1 = new SmartTv();

        t1.switchON();
        t1.changeChannel();

    }
}
