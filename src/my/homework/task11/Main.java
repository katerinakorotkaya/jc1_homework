package my.homework.task11;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the integer number (day of week) from 1 to 7, please: ");
        int day = scanner.nextInt();
        switch (day) {
            case 1:
                System.out.println("Monday: Finish the report for the client.");
                break;
            case 2:
                System.out.println("Tuesday: Go to programming courses.");
                break;
            case 3:
                System.out.println("Wednesday: Do the homework for courses; buy a gift for mom.");
                break;
            case 4:
                System.out.println("Thursday: Go to programming courses; order a book.");
                break;
            case 5:
                System.out.println("Friday: Write in the Timesheet; meet with friends.");
                break;
            case 6:
                System.out.println("Saturday: Clean up the apartment; do the homework for courses.");
                break;
            case 7:
                System.out.println("Sunday: Comb out the dogs; watch Episode 7 of Star Wars.");
                break;
            default:
                System.out.println("There is no such day of the week. Please, try again.");
        }
    }
}
