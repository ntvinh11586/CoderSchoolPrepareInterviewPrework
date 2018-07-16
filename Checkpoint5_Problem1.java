package com.vinh.coderschool;

import java.util.ArrayList;
import java.util.List;

public class Checkpoint5_Problem1 {

    public List<List<Integer>> solve(List<Integer> list, int start) {

        List<List<Integer>> result = new ArrayList<>();
        result.add(list);

        for (int i = start; i < list.size(); i++) {

            for (int j = 0; j < i; j++) {
                if (!list.get(i).equals(list.get(j))) {
                    int temp1 = list.get(i);
                    int temp2 = list.get(j);
                    List<Integer> newList = new ArrayList<>(list);
                    newList.set(i, temp2);
                    newList.set(j, temp1);
                    result.addAll(solve(newList, i + 1));
                }
            }
        }

        return result;
    }
}
