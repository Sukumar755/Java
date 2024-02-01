package Other;

public class DiscountVariableArguments {

    public static void discount(double ... price)
    {
        double sum = 0;
        for(int i =0;i<price.length;i++)
        {
           sum = sum+price[i];
        }
        System.out.println("The total sum of the price is "+sum);

        if(sum>0 && sum<=100)
        {
            double discountedPrice = (sum/100) * 5;
            System.out.println("You will get a discount of 5%");
            System.out.println("The discounted price is "+(sum-discountedPrice));

        }

        else if(sum>100 && sum<200)
        {
            double discountedPrice = (sum/100) * 10;
            System.out.println("You will get a discount of 10%");
            System.out.println("The discounted price is "+(sum-discountedPrice));

        }
        else if(sum>200 && sum<300)
        {
            double discountedPrice = (sum/100) * 20;
            System.out.println("You will get a discount of 20%");
            System.out.println("The discounted price is "+(sum-discountedPrice));

        }
        else if(sum>300)
        {
            double discountedPrice = (sum/100) * 200;
            System.out.println("You will get a discount of 30%");
            System.out.println("The discounted price is "+(sum-discountedPrice));

        }



    }

    public static void main(String[] args)
    {
        discount(25,25,25,26);
    }
}
