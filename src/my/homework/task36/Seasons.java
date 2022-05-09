package my.homework.task36;

import java.util.Scanner;

public enum Seasons {
    WINTER(1),
    SPRING(2),
    SUMMER(3),
    AUTUMN(4);

    int number;
    String description;
    int countOfDays;


    Seasons(int number) {
        this.number = number;
    }

    Scanner scanner = new Scanner(System.in);

    public int getSeasons() {
        System.out.println("Please, enter the number from 1 to 4");
        Scanner scanner = new Scanner(System.in);
        int numSeason = scanner.nextInt();

        switch (numSeason) {
            case 1:
                System.out.println("WINTER");
                break;
            case 2:
                System.out.println("SPRING");
                break;
            case 3:
                System.out.println("SUMMER");
                break;
            case 4:
                System.out.println("AUTUMN");
                break;
            default:
                System.out.println("Incorrect number! Please, try again.");
                System.exit(0);
        }
        return getSeasons();
    }
}