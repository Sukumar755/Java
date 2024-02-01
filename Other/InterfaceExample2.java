package Other;
class Phone{
    public void call(){
        System.out.println("Phone call is connecting");}
    public void msg(){
        System.out.println("Message is sent from Phone");
    }
}

interface Icamera{
    void click();
    void record();
}

interface IMusicPlayer{
    void playMusic();
    void stopMusic();
}

class Smartphone extends Phone implements Icamera,IMusicPlayer{
    public void click(){System.out.println("Photo is taken from smartphone");}
    public void record(){System.out.println("Video is being recorded in the smartphone");}
    public void playMusic(){System.out.println("Music is playing from the smartphone");}
    public void stopMusic(){System.out.println("Music is stopped");}
}
public class InterfaceExample2 { public static void main(String[] args){

    IMusicPlayer s = new Smartphone();
    s.playMusic();
    s.stopMusic();
    //only these two methods are available, because only these methods are in IMusicPlayer and those are overridden.
    //In the same way look at the Reference and object in the code below.
    Icamera c = new Smartphone();
    c.click();
    c.record();

    Phone p = new Smartphone();
    p.msg();
    p.call();

    //but when you create an object with reference to SmartPhone, you will be able to access all the methods.






}
}
