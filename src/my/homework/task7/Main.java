package my.homework.task7;

public class Main {
    public static void main(String[] args) {
        int a = 18;
        int b = 2;
        int r = 10;
        if (r * r >= a * a + b * b / 4) {
            System.out.println("The rectangle will be completely covered by the round cardboard.");
        } else {
            System.out.println("The rectangle will not be completely covered by the round cardboard. The list of round cardboard must have a larger radius.");
        }
    }
}
