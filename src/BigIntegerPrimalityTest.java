import java.math.BigInteger;
import java.util.Scanner;

public class BigIntegerPrimalityTest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BigInteger n = input.nextBigInteger();

        if(n.isProbablePrime(1)){
            System.out.println("prime");
        }
        else{
            System.out.println("not prime");
        }
        input.close();
    }
}
