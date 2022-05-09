package my.homework.task43;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter the dividend and divisor: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (b != 0) {
            System.out.println("It's all correct");
        } else {
            try {
                int c = a / b;
            } catch (ArithmeticException e) {
                System.out.println("Can't divide by zero!");
            }
        }
    }
}

