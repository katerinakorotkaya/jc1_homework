package my.homework.task28;

import java.util.Scanner;

public class LastLettersOfWords {
    public void LastLettersOfWords() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter the text: ");
        String str = scanner.nextLine();
        StringBuilder sbild = new StringBuilder();

        String[] words = str.split("\\s+");
        for (String word : words) {
            sbild.append(word.toCharArray()[word.length() - 1]);
        }
        System.out.println("The result of the analysis: " + sbild.toString());
    }
}

