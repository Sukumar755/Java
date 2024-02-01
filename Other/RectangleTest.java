package Other;

class Rectangle{

    //Properties
    private double length;
    private double breadth;

    //property methods - getters and setters.

    public double getLength()
    {
        return length;
    }
    public void setLength(double length)
    {
        this.length=length;
    }
    public double getBreadth()
    {
        return breadth;
    }
    public void setBreadth(double breadth)
    {
        this.breadth=breadth;
    }

//Methods
   public double area(){
        return length*breadth;
   }
   public double perimeter(){
        return 2*length*breadth;
   }

   public void isSquare(){
        if(length==breadth){
            System.out.println("This is a square");}
            else
            System.out.println("This is not a square");
        }
   }

public class RectangleTest {
    public static void main(String[] args){

        Rectangle R1= new Rectangle();

        R1.setLength(6);
        R1.setBreadth(5);

        R1.isSquare();
        System.out.println(R1.area());
        System.out.println(R1.perimeter());
    }
}
