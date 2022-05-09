package my.homework.task38;

import java.util.Scanner;

public class Garage extends Vehicle {

    public String standInGarage() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Vehicle in the garage: ");
        String str = scanner.nextLine();


        /*Scanner s = new Scanner(System.in);  // понимаю, что здесь необходимы проверки, на размер вводимых букв,
        String model; // отсутсвие знаков или цифр. не получается вставить Exception

        System.out.println("Enter car model ");
        model = s.next();

        try {
            if (!model.matches("^[a-zA-Z]+$")) {
                throw new Exception("It's wrong!");
            } else {
                System.out.println("It's correct");
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        */

        if (str.equals("Tesla")) {
            System.out.println("Car in the garage.");
        } else if (str.equals("Yamaha")) {
            System.out.println("Motorcycle in the garage.");
        } else {
            System.out.println("Vehicle not found. Please, try again.");
        }
        return str;
    }
}