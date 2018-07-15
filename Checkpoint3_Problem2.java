package com.vinh.coderschool;

public class Checkpoint3_Problem2 {

    // Java standard does not have Pair<B, C> like Python
    public int solve(int[] a, int B, int C) {

        int[] composedSum = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            if (i == 0) {
                composedSum[i] = a[i];
            } else {
                composedSum[i] = composedSum[i - 1] + a[i];
            }
        }

        int results = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {

                int sum;
                if (i == 0) {
                    sum = composedSum[j];
                } else {
                    sum = composedSum[j] - composedSum[i - 1];
                }


                if (B <= sum && sum <= C) {
                    results++;
                }
            }
        }

        return results;
    }
}
