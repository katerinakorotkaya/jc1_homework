package my.homework.task21;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Integer[] numbers = new Integer[10];
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(10);
            System.out.print(numbers[i]);
            System.out.println();
        }

        List<Integer> numbersList = Arrays.asList(numbers);
        int minNumber = Collections.min(numbersList);
        int maxNumber = Collections.max(numbersList);

        int firstMinNumberIndex = numbersList.indexOf(minNumber);
        int lastMinNumberIndex = numbersList.lastIndexOf(minNumber);
        int firstMaxNumberIndex = numbersList.indexOf(maxNumber);
        int lastMaxNumberIndex = numbersList.lastIndexOf(maxNumber);

        if (firstMinNumberIndex == lastMinNumberIndex && firstMaxNumberIndex == lastMaxNumberIndex) {
            if (firstMinNumberIndex < firstMaxNumberIndex) {
                calculateNumbers(firstMinNumberIndex, firstMaxNumberIndex, numbers);
            } else {
                calculateNumbers(firstMaxNumberIndex, firstMinNumberIndex, numbers);
            }
        } else {
            int index1 = lastMaxNumberIndex - firstMinNumberIndex;
            int index2 = lastMinNumberIndex - firstMaxNumberIndex;
            System.out.println("Index = " + Math.max(index1, index2));
        }
    }

    private static void calculateNumbers(int startIndex, int finalIndex, Integer[] numbers) {
        int sum = 0;
        for (int i = startIndex + 1; i < finalIndex; i++) {
            sum += numbers[i];
        }
        System.out.print("Sum = " + sum);
    }
}

