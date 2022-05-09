package my.homework.task12;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        outPut();
        calculateFactorial();
    }

    public static void outPut() {
        System.out.print("Find the factorial of a number from 0 to 10. Please, enter the number: ");
    }

    public static void calculateFactorial() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int value = scanner.nextInt();
            long i = 1L;

            long factorial;
            for (factorial = 1L; i <= (long) value; ++i) {
                factorial *= i;
            }

            if (value > 10) {
                System.out.println("You entered a number greater than 10. Please, try again.");
                System.exit(0);
            } else {
                System.out.println("Factorial of the number " + value + " = " + factorial);
            }
        }
    }
}
