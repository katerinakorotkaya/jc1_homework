package my.homework.task29;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class SearchNumbers {
    public void searchNumbers() {

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        Pattern pat = Pattern.compile("0x[A-Fa-f0-9]");
        Matcher mat = pat.matcher(str);
        while (mat.find()) {
            System.out.println(mat.start() + " " + mat.end());
        }
    }
}
