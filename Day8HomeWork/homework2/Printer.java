package com.talent.java.talent_java_homework.Day8HomeWork.homework2;

import java.util.ArrayList;
import java.util.List;

public class Printer<T> {
    List<T> items = new ArrayList<T>();





    public void add(T item) {
        items.add(item);
    }

    public void printAll() {
        for (T item : items) {
            System.out.println(item);
        }
//    }


    }
}
