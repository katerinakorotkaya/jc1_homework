package my.homework.task44;

import java.util.Scanner;

public class Main {
    static final String My_STRING = "END";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter the number or end the program. ");
        String anotherStr = scanner.nextLine();
        while (!My_STRING.equalsIgnoreCase(anotherStr)) { // для считывания команды end, независимо, заглавные или прописные буквы
            Integer number = getNumber(anotherStr);
            if (number != null) {
                analyseNumber(number);
            }
            anotherStr = scanner.next();
        }
    }

    private static Integer getNumber(String number) {
        try {
            return Integer.parseInt(number);
        } catch (Exception e) {   // исключем ошибку и возвращаем значение для продолжения работы программы
            System.out.println("Not a number! Please, try again. ");
            return null;
        }
    }

    private static void analyseNumber(Integer number) {
        if (number % 2 == 0) {
            System.out.println("Even number.");
        } else
            System.out.println("Odd number.");
    }
}
