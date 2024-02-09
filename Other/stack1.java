package Other;


class Stack
{
    public int StackArray[];
    public int arraySize;
    public int top = -1;

    public Stack(int s){
        this.arraySize=s;
        this.StackArray= new int[arraySize];}



    void push(int x) throws StackOverflow
    {

        if (arraySize - 1 == top)
            throw new StackOverflow();
        else
        {
            top++;
            StackArray[top] = x;

        }
    }


    public int pop() throws StackUnderflow
    {
        if(top==-1)
            throw new StackUnderflow();
        else
        {
         int x = StackArray[top--];
         return x;
        }
    }


    public void display(){
        System.out.print("The elements of the value are ");
    for(int i =0;i<StackArray.length;i++)
    {
        System.out.print(StackArray[i]+ " ");
    }
        System.out.println();
    }
}


    class StackOverflow extends Exception{
    public String toString(){return "Stack is overflowing";}

}

class StackUnderflow extends Exception{
    public String toString(){return "Stack is underflowing";}

    }

public class stack1{
    public static void main(String[] args) {
        Stack newStack = new Stack(4);
        try{
            newStack.display();
//            newStack.push(3);
//            newStack.push(5);
//            newStack.push(7);
//            newStack.push(9);
//            newStack.push(11);
//            newStack.push(10);
            newStack.pop();
            newStack.push(11);
            newStack.display();
        }

        catch(Exception S){
            System.out.println(S);;
            }
        }


    }

