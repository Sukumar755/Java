package Other;

public class Diamond {
    public static void main(String[] args) {
        int Rows = 5;

        for (int i = 1; i <= Rows; i++) {

            for (int j = 1; j <= Rows - i; j++) {
                System.out.print(" ");}

            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }


            System.out.println();
        }
    }
}