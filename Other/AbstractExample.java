package Other;

import org.w3c.dom.ls.LSOutput;

abstract class Shape{

    abstract public void perimeter();

    abstract public void area();
}

class Circle extends Shape{

    public Circle(){
        System.out.println("Circle constructor");
    }

    int radius;
    public void perimeter(){
        System.out.println(2*Math.PI*radius);
    }

    public void area(){
        System.out.println(Math.PI*radius*radius);
    }
}


class Rectanglenew extends Shape{

    int length;
    int breadth;
    public Rectanglenew(){
        System.out.println("Rectangle constructor");
    }

    public void area(){
        System.out.println(length*breadth);
    }
    public void perimeter(){
        System.out.println(2*(length+breadth));
    }

}
public class AbstractExample {public static void main(String[] args){

    Shape s = new Circle();
}

}
