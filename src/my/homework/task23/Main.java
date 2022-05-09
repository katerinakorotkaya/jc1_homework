package my.homework.task23;

public class Main {
    public static void main(String[] args) {
        int[][] array = new int[5][5];
        int i, y;

        for (i = 0; i < array.length / 2 + 1; i++) {
            for (y = 0; y < array[i].length; y++) {
                if ((y < i) || (y >= (array[i].length - i)))
                    array[i][y] = 0;
                else
                    array[i][y] = 1;
            }
        }
        for (i = array.length - 1; i >= array.length / 2 + 1; i--) {
            for (y = 0; y < array[i].length; y++) {
                if ((y < (array[i].length - 1 - i)) || (y > i))
                    array[i][y] = 0;
                else
                    array[i][y] = 1;
            }
        }
        for (i = 0; i < array.length; i++) {
            for (y = 0; y < array[i].length; y++) {
                System.out.print(array[i][y]);
            }
            System.out.println(" ");
        }
    }
}
