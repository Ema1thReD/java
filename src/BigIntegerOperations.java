import java.math.BigInteger;
import java.util.Scanner;

public class BigIntegerOperations
{
    final static Scanner scanner=new Scanner(System.in);
    public static void main(String args[]){
        //System.out.println("")
        BigInteger bi1=scanner.nextBigInteger();
        BigInteger bi2=scanner.nextBigInteger();
        System.out.println(bi1.add(bi2));
        System.out.println(bi1.multiply(bi2));
    }
}
