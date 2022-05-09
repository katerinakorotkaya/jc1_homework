package my.homework.task45;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void foundFile() throws FileNotFoundException {
        File file = new File("headfirst");
        Scanner scanner = new Scanner(file);
    }

    public static void main(String[] args) {
        try {
            foundFile();
        } catch (FileNotFoundException e) {
            System.out.println("This file not found!");
        }
    }
}