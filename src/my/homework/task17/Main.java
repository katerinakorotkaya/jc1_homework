package my.homework.task17;

import java.text.DecimalFormat; // for accounting format
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Please, enter any number: ");

        while (true) {
            Scanner scanner = new Scanner(System.in);
            long l = scanner.nextLong();
            DecimalFormat df = new DecimalFormat("##,###,###");
            System.out.println("Number in the accounting format: " + df.format(l));
        }
    }
}
