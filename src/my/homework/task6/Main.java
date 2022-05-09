package my.homework.task6;

public class Main {
    public static boolean methodOne(int x) {
        return x % 10 == 7;
    }

    public static void main(String[] args) {
        boolean a = methodOne(837);
        System.out.println(a);
    }
}
