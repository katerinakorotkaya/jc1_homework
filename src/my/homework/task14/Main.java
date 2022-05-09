package my.homework.task14;

public class Main {

    public static void main(String[] args) {
        System.out.println("The result of the sum of the digits of the number 7_893_823_445 is " + sumOfNumbers());
    }

    public static long sumOfNumbers() {
        long number = 7893823445L;
        long sum = 0L;
        do {
            sum += number % 10L;
        } while ((number /= 10L) != 0L);
        return sum;
    }
}
