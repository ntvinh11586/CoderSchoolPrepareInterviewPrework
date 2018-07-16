package com.vinh.coderschool;

import java.util.LinkedList;

public class Checkpoint4_Problem1 {

    public LinkedList<Integer> solve(LinkedList<Integer> linkedList) {

        LinkedList<Integer> result = linkedList;
        for (int i = 0; i < linkedList.size() / 2; i++) {
            int value = linkedList.get(linkedList.size() - i - 1) - linkedList.get(i);
            result.set(i, value);
        }

        return result;
    }
}
