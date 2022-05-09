package my.homework.task31;

public class Main {
    public static void main(String[] args) {
        long l = System.currentTimeMillis();
        String str = " ";
        for (int i = 0; i < 1_000_000; i++) {
            str = str + "aaabbbccc";
        }
        System.out.println("Result of this method (use String) is " + (System.currentTimeMillis() - l));

        long l2 = System.currentTimeMillis();
        StringBuilder sbild = new StringBuilder();
        sbild.append("aaabbbccc".repeat(1_000_000));
        System.out.println("Result of this method (use StringBuilder) is " + (System.currentTimeMillis() - l2));
    }
}
