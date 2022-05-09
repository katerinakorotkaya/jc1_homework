package my.homework.task19;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{3, 8, 2, 7, 1, 5, 6, 4, 9, 10};
        System.out.println("Elements in even positions: ");

        for(int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                System.out.print(array[i] + ", ");
            }
        }
    }
}
