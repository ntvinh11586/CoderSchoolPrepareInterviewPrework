package com.vinh.coderschool;

import java.util.HashSet;
import java.util.Set;

public class Checkpoint5_Problem2 {

    // O(n^2)
    public int solve(int[] a) {

        Set<Integer> setNumber = new HashSet<>();
        for (int item : a) {
            setNumber.add(item);
        }

        int maxSequence = 0;

        for (int item : setNumber) {

            if (!setNumber.contains(item - 1)) {

                int currentItem = item;
                int tempSequenceLength = 1;

                while (setNumber.contains(currentItem + 1)) {
                    currentItem++;
                    tempSequenceLength++;
                }

                maxSequence = Math.max(maxSequence, tempSequenceLength);
            }
        }

        return maxSequence;
    }
}
