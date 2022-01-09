package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        // Task 1
        var list = new ArrayList<Integer>();
        Collections.addAll(list, 3, 9, 11, 18, 20, 22);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 3 == 0) {
                list.remove(i);
                i--;
            }
        }
        System.out.println(list);
        System.out.println("-------------------");
        // Task 2
        var list2 = new ArrayList<String>();
        Collections.addAll(list2, "Orange", "Pineapple", "Banana", "Grapes", "Apple");
        int indexOrange = list2.indexOf("Orange");
        int indexGrapes = list2.indexOf("Grapes");
        if (list2.contains("Orange") && list2.contains("Grapes")) {
            list2.set(indexOrange, "Grapes");
            list2.set(indexGrapes, "Orange");

            System.out.println(list2);
        } else {
            System.out.println("Value not present");
            System.out.println("-------------------");
        }
        // Task 3
        var list3 = new ArrayList<Integer>();
        Collections.addAll(list3, 5, 3, 15, 1, 500);
        var list4 = new ArrayList<Integer>();
        Collections.addAll(list4, 5, 4, 3, 2, 18, 8);
        var list5 = new ArrayList<>(list4);
        System.out.println(list3);
        System.out.println(list4);
        list5.retainAll(list3);
        list5.retainAll(list3);
        if (list5.isEmpty()) {
            System.out.println("sorry, lists doesn't have similar elements");
        } else {
            System.out.println("similar elements " + list5);
        }
    }
}

