package my.homework.task29;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter the text: "); //for example 0x7ddfffff and etc, or another text .

        SearchNumbers searchNumbers = new SearchNumbers();
        searchNumbers.searchNumbers();
    }
}
