package my.homework.task46;

import java.io.File;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        File read = new File("/D:/work3/");

        if (read.isDirectory()) {

            for (File file : Objects.requireNonNull(read.listFiles())) {
                if (file.isDirectory()) {
                    System.out.println(file.getName() + "\t - catalog");
                } else {
                    System.out.println(file.getName() + "\t - file");
                }
            }
        }
    }
}
