package com.vinh.coderschool;

public class Checkpoint2 {

    public int[][] solve(int A) {

        int[][] matrix = new int[A * 2 - 1][A * 2 - 1];

        for (int i = 0; i < A; i++) {

            for (int j = 0; j < A; j++) {

                int value;
                if (i == 0 || j == 0) {
                    value = A;
                } else if (matrix[i - 1][j - 1] == matrix[i][j - 1] && matrix[i][j - 1] == matrix[i - 1][j]) {
                    value = matrix[i - 1][j - 1] - 1;
                } else {
                    value = Math.min(matrix[i - 1][j - 1], Math.min(matrix[i][j - 1], matrix[i - 1][j]));
                }

                matrix[i][j] = value;
                matrix[A * 2 - 2 - i][j] = value;
                matrix[i][A * 2 - 2 - j] = value;
                matrix[A * 2 - 2 - i][A * 2 - 2 - j] = value;
            }
        }

        return matrix;
    }
}
