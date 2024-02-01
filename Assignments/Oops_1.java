package Assignments;

class Person{

    String personName;
    int personAge;

    public String getPersonName() {return personName;}
    public int getPersonAge(){ return personAge;}


    //this is the method to give the info about the object we've created
    public String toString(){return "Person's name is "+getPersonName()+" and his age is "+getPersonAge();}

    public void setPersonName(String name){this.personName=name;}
    public void setPersonAge(int age){this.personAge=age;}

    public Person(String personName,int age){
        this.personName=personName;
        this.personAge=age;
    }

    public Person(){

    }

}
public class Oops_1 {public static void main(String[] args){

    Person person1 = new Person("Sukumar",28);



    Person person2 = new Person();
    person2.setPersonName("Gowtham");
    person2.setPersonAge(27);

//    System.out.println("The first person's name is "+person1.personName+" and his age is "+person1.getPersonAge());
//    System.out.println("The second person's name is "+person2.personName+" and his age is "+person2.getPersonAge());
    System.out.println(person1);
    System.out.println(person2);
}
}
