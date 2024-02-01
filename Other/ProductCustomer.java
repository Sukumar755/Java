package Other;

class Product{

    //properties
    private int itemNo;
    private String name;
    private double price;
    private int quantity;


    //property methods

    public int getItemNo()
    {
        return itemNo;
    }

    public String getName()
    {
        return name;
    }
    public double getPrice()
    {
        return price;
    }
    public void setPrice(double p)
    {
        price=p;
    }
    public int getQuantity()
    {
        return quantity;
    }
    public void setQuanity(int q)
    {
        quantity=q;
    }




    //constructors

    public Product(int itmNo){
        itemNo = itmNo;

    }

    public Product(int itmNo,String n)
    {
        itemNo=itmNo;
        name=n;
    }
    public Product(int itmNo,String n,double p,int q){
        itemNo=itmNo;
        name= n;
        price=p;
        quantity=q;
    }


}


class Customer{

    //properties
    private String customerName;
    private int customerId;
    private String address;
   private String phoneNo;

//property methods

    public String getCustomerName(){ return customerName;}
//    public void setCustomerName(String name) { customerName=name;}

    public int getCustomerId(){ return customerId;}
//    public void setCustomerId(int id) { customerId=id;}


    public String getAddress() { return address;}
    public void setAddress(String add) {address=add;}

    public String getPhoneNo(){ return phoneNo;}
    public void setPhoneNo(String phone){phoneNo=phone;}

    public Customer(String custName,int id,String ad,String pn)
    {
        customerName=custName;
        customerId=id;
        address=ad;
        phoneNo=pn;
    }





}






public class ProductCustomer {
}
