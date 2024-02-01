package Assignments;

class TrafficLight{

    private String color;
    private double duration;

    public String getColor(){ return color;}
    public double getDuration(){ return duration;}

    public void setColor(String color){ this.color=color;}
    public void setDuration(double duration){this.duration=duration;}

    public void isRedorGreen(){
        if(color == "red")
        System.out.println("Traffic light color is  "+color);

        else if(color=="green")
            System.out.println("Traffic light color is  "+color);
    }


    public TrafficLight(){

    }
    public TrafficLight(String color,double duration){
        this.color=color;
        this.duration=duration;
    }

    public String toString(){return "The traffic light is "+ color+ " and the duration is "+duration+" seconds";}

    public void whatColorIsTrafficLight(){
        System.out.println("The traffic light color is "+getColor());
    }

}

public class TrafficLightAssignment { public static void main(String[] args){

    TrafficLight T1 = new TrafficLight("red",20);

    System.out.println(T1);

    T1.isRedorGreen();
    T1.whatColorIsTrafficLight();


}
}
