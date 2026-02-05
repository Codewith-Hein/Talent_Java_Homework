package com.talent.java.talent_java_homework.Day8HomeWork.homework2;

public class PrintItmes {

    public static void main(String[] args) {
        Printer<Integer> intPrinter = new Printer<>();

        intPrinter.add(10);
        intPrinter.add(20);
        intPrinter.add(30);

        System.out.println("Integer value");
        intPrinter.printAll();
        Printer<Double> doublePrinter = new Printer<>();

        doublePrinter.add(10.5);
        doublePrinter.add(20.75);
        doublePrinter.add(30.25);

        System.out.println("Double value");
        doublePrinter.printAll();
    }
}
