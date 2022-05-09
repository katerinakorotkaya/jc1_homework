package my.homework.task22;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Array: ");

        int rev;
        for (rev = 0; rev < array.length; rev++) {
            array[rev] = rev + 1;
            System.out.print(array[rev] + " ");
        }

        System.out.println();
        rev = array.length;

        int i;
        for (i = 0; i < rev / 2; i++) {
            int ran = array[rev - i - 1];
            array[rev - i - 1] = array[i];
            array[i] = ran;
        }

        System.out.println("Reverse array: ");

        for (i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
