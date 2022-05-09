package my.homework.task20;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[10];
        int maxValue = array[0];
        int maxIndex = 0;
        System.out.print("Array of integers: ");
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
            System.out.print(+array[i] + " ");
            if (maxValue <= array[i]) {
                maxValue = array[i];
                maxIndex = i;
            }
        }
        System.out.println();
        System.out.println("The maximum value of this array is " + maxValue);
        System.out.println("The index of the maximum element of this array is " + maxIndex);
    }
}

