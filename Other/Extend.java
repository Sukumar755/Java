package Other;
class Rectangle1{

    int length;
    int breadth;


}

class Cuboid extends Rectangle1{
    int height;

    public Cuboid(int height){this.height=height;
    }
    public Cuboid(int length,int breadth,int height){

        super.length=length;
        super.breadth=breadth;
        this.height=height;
    }
    void display(){
        System.out.println("Length: "+this.length+" \nBreadth: "+this.breadth+" \nHeight: "+this.height);
    }

}


public class Extend {public static void main(String[] args){



}
}
