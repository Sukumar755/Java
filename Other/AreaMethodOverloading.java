package Other;

public class AreaMethodOverloading {

    static int area(int l,int b)// here l is length and b is breadth
    {
        int area = l*b;
        return area;
    }

    static double area(int radius)
    {
        double area = Math.PI*radius*radius;
        return area;
    }



    public static void main(String[] args)
    {
        int length_of_rectangle = 5;
        int breadth_of_rectangle  = 6;
        int radius_of_circle = 3;

        System.out.println("The area of the rectangle is "+area(length_of_rectangle,breadth_of_rectangle));

        System.out.println("The area of the circle is "+ area(radius_of_circle));

    }
}
