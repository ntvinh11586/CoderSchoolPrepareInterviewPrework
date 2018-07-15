package com.vinh.coderschool;

import java.util.LinkedList;

public class Checkpoint4_Problem1 {

//    public NodeList solve(NodeList list) {
//
//        NodeList iterate = list;
//        int size = 0;
//        while (iterate != null) {
//            size++;
//            iterate = iterate.next;
//        }
//
//        int index = 0;
//        iterate = list;
//        NodeList result = null;
//        while (iterate != null) {
//
//            int reversedIndex = size - index - 1;
//            int tempIndex = 0;
//            NodeList tempIterate = list;
//            while (tempIterate != null) {
//                tempIndex++;
//                tempIterate = tempIterate.next;
//                if (tempIndex == reversedIndex) break;
//            }
//
//            int value = tempIterate.value - iterate.value;
//            if (result == null) {
//                result = new NodeList(value);
//            } else {
//                result.next = new NodeList(value);
//                result = result.next;
//            }
//
//            iterate = iterate.next;
//
//            if (index == ) break;
//        }
//
//        return null;
//    }

    public LinkedList<Integer> solve(LinkedList<Integer> linkedList) {

        LinkedList<Integer> result = linkedList;
        for (int i = 0; i < linkedList.size() / 2; i++) {
            int value = linkedList.get(linkedList.size() - i - 1) - linkedList.get(i);
            result.set(i, value);
        }

        return result;
    }
}
