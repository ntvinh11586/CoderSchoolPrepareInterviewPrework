package com.vinh.coderschool;

public class Checkpoint4_Problem2 {

    int[] solve(int[] a) {

        int[] result = new int[a.length];

        for (int i = 0; i < a.length; i++) {

            int resultFound = -1;
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] < a[j]) {
                    resultFound = a[j];
                    break;
                }
            }

            result[i] = resultFound;
        }

        return result;
    }
}
