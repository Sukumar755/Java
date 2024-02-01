package Other;

class CyclinderClass{
    public double height;
    public double radius;
    public double lidArea(){
        return Math.PI*radius*radius;
    }
    public double Circumference(){
        return 2*Math.PI*radius;
    }
    public double totalSurfaceArea(){
        return 2*lidArea()+Circumference()*height;
    }

}
public class Cylinder {public static void main(String[] args){
    CyclinderClass C = new CyclinderClass();

    C.radius = 2.5;
    C.height = 6;

    System.out.println(C.totalSurfaceArea());




}
}
