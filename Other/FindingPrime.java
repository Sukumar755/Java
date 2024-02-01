package Other;

public class FindingPrime {
    static boolean isPrime(int n) {
        for (int i = 2; i < n / 2; i++)
        {
            if (n % i == 0)
                 return false;
        }
        return true;
    }

    public static void main(String[] args) {

        //System.out.println(isPrime(89));

        if(isPrime(3))
        {System.out.println("this is prime");}
        else
            System.out.println("not a prime");
    }
}


