package ArrayPackage;

public class AddingMatrices {public static void main(String[] args){

    int[][] numbers1 ={ {1,2,3},
                        {4,5,6},
                        {7,8,9}};

    int[][] numbers2 ={ {1,0,0},
                        {0,1,0},
                        {0,0,1}};

    int[][] numbers3 = new int[3][3];

    for(int i =0;i<numbers1.length;i++)/*/ we can take
    numbers1.length or numbers2.length here, because both the lengths are same*/
    {
        for(int j=0;j<numbers1[0].length;j++)/* here we can take numbers1[0] or numbers1[1] numbers1[2] or numbers2[0] numbers2[1] or numbers2[2]*/
        {
            numbers3[i][j]=numbers1[i][j]+  numbers2[i][j];
        }
    }

    // then another loop for printing the array,
    // we can also take FOR EACH  loop, but I'm taking normal for loop*/

    for(int i =0;i<numbers3.length;i++)
    {
        for(int j=0;j<numbers3[0].length;j++)
        {
            System.out.format("%2d ",numbers3[i][j]);
        }
        System.out.println();
    }

    //ok i am gonna use for each loop

    for(int x[]: numbers3)
    {
        for(int y: x){
            System.out.format("%04d ",y);
        }
        System.out.println();
    }
}

}
