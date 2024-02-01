package ArrayPackage;

import java.util.Arrays;

public class CopyingElementsInReverseOrder {

        public static void main(String[] args){


            int[] raj= {1,2,3,4,5};
            int[] sravs =new int[5];

            System.out.println("These are the elements in raj array: " + Arrays.toString(raj));
            System.out.println("These are the elements in sravs array before copying: " +Arrays.toString(sravs));
            for(int i =0;i<5;i++)
            {
                sravs[(sravs.length-1)-i]=raj[i];
            }

            System.out.println("These are the elements in sravs array after copying: " +Arrays.toString(sravs));
        }
    }


