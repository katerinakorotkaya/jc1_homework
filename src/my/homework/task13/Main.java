package my.homework.task13;

import java.math.BigInteger;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        System.out.println("Multiplication result of numbers from 1 to 25 is " + incNumber());
    }

    public static BigInteger incNumber() {
        BigInteger result = BigInteger.ONE;
        int i = 1;
        do {
            BigInteger value = BigInteger.valueOf((long) i);
            result = result.multiply(value);
            ++i;
        } while (i <= 25);
        return result;
    }
}
