package Other;

class Subject{
    private String subId;
    private String subName;
    private int maxMarks;
    private int marksObtained;


    public String getSubId(){return subId;};
    public String getSubName(){return subName;};
    public int getMaxMarks(){return maxMarks;};
    public int getMarksObtained(){return marksObtained;};


    public void setMarksObtained(int marksObtained){ this.marksObtained=marksObtained;};

    public String toString(){return "\nSUBJECT NAME: "+ subName+ "\nSUBJECT ID: "+subId+"\nMARKS OBTAINED: "+ marksObtained;};
public Subject(String subId,String name)
{
    this.subId=subId;
    subName=name;
}

public Subject(String subId,String name,int maxMarks)
{
    this.subId=subId;
    subName=name;
    this.maxMarks=maxMarks;
}

    public Subject(String subId,String name,int maxMarks,int marksObtained)
    {
        this.subId=subId;
        subName=name;
        this.maxMarks=maxMarks;
        this.marksObtained=marksObtained;
    }
}

class Studentinfo {
    private int rollNo;
    private String name;
    private String dept;
    private String subject;


    //property methods

    public int getRollNo(){ return rollNo;};
    public String getName(){return name;};
    public String getDept(){ return dept;};


    public void setDept(String dept){ this.dept=dept;};


}







public class SubjectAndStudent { public static void main(String[] args){


    Subject s[]=new Subject[3];

     s[0]=new Subject("A123","Chemistry",100,79);
     s[1]= new Subject("A456","Maths",100,68);
     s[2]= new Subject("A789","Physics",100,85);

     for(int i =0;i<s.length;i++)
     {
         System.out.println(s[i].toString());
     }
     }


}
