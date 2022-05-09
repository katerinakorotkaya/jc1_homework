package my.homework.task4;

public class Main {
    public static int methodName(int a, int b) {
        int sum = a + b;
        int inc = a * b;
        return sum + inc;
    }

    public static void main(String[] args) {
        int x = methodName(3, 18);
        System.out.println("The result of this method is: " + x);
    }
}

