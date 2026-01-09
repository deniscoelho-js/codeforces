package core.io.codeforces;

import java.math.BigInteger;
import java.util.Scanner;

public class C630 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        BigInteger dois = BigInteger.valueOf(2);
        BigInteger result = dois.pow(n + 1).subtract(BigInteger.valueOf(2));

        System.out.println(result);
    }
}
