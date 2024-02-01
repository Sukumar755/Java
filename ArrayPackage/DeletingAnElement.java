package ArrayPackage;

public class DeletingAnElement {public static void main(String[] args){

    int numbers[]=new int[6];

    numbers[0]=2;
    numbers[1]=4;
    numbers[2]=6;
    numbers[3]=8;

    //this array looks like [2,4,6,8,0,0]
    //I want 4 to be deleted and move 6,8 towards left.
    //so that array will look like [2,6,8,0,0,0]

    for(int i =1; i<numbers.length-1;i++){

        numbers[i]=numbers[i+1];// here numbers[1]=numbers[2].. and so on.
    }

    for(int x:numbers){
        System.out.print(x+" ");
    }
}
}
