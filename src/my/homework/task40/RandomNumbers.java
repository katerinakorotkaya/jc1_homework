package my.homework.task40;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RandomNumbers {
    int elements = 20;

    public void removeRepeatingNumbers() {
        List<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < elements; i++) {
            int j = (int) (Math.random() * 20 + 1);
            arrayList.add(j);
        }
        System.out.println("Result: " + arrayList);

        Set<Integer> set = new LinkedHashSet<>(arrayList);
        System.out.println("Without the repeating numbers: " + set);
    }
}
