package my.homework.task16;

public class Main {

    public static void main(String[] args) {
        int i = 0;
        String name = "Hope!";
        for (i = 1; i <= 100; i++) {
            if (i % 7 == 0) {
                System.out.println(i + ":  " + name);
            }
        }
    }
}
