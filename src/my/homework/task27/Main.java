package my.homework.task27;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CountOfWords countOfWords = new CountOfWords();
        countOfWords.countOfWords();
    }
}

class CountOfWords {

    public void countOfWords() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter the text: ");
        String str = scanner.nextLine();
        int count = 0;
        if (str.length() != 0) {
            count++;
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                count++;
            }
        }
        System.out.println("You have entered " + count + " word(s).");
    }
}