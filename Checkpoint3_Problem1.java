package com.vinh.coderschool;

public class Checkpoint3_Problem1 {

    int solve(int[] array, int k) {

        int element = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {

            int countGreater = 0;
            int countEquals = 0;
            for (int j = 0; j < array.length; j++) {
                if (i == j) continue;
                if (array[i] > array[j]) {
                    countGreater++;
                } else if (array[i] == array[j]) {
                    countEquals++;
                }
            }

            if (countEquals == 0 && countGreater == k - 1) {
                return array[i];
            }

            if (countEquals > 0 && countEquals + countGreater >= k - 1) {
                if (element > array[i]) {
                    element = array[i];
                }
            }
        }

        return element;
    }
}
