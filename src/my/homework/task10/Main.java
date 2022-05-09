package my.homework.task10;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the integer numbers, please: ");
        int y = scanner.nextInt();
        int f = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        if (y >= a + c && f >= b && f >= d) {
            System.out.println("1. Houses are placed on the area.");
        } else if (y >= a + d && f >= b && f >= c) {
            System.out.println("2. Houses are placed on the area");
        } else if (y >= b + c && f >= a && f >= d) {
            System.out.println("3. Houses are placed on the area");
        } else if (y >= b + d && f >= a && f >= c) {
            System.out.println("4. Houses are placed on the area");
        } else if (f >= a + c && y >= b && y >= d) {
            System.out.println("5. Houses are placed on the area");
        } else if (f >= a + d && y >= b && y >= c) {
            System.out.println("6. Houses are placed on the area");
        } else if (f >= b + c && y >= a && y >= d) {
            System.out.println("7. Houses are placed on the area");
        } else if (f >= b + d && y >= a && y >= c) {
            System.out.println("8. Houses are placed on the area");
        } else {
            System.out.println("Houses aren't placed on the area");
        }
    }
}
