package ru.bvkuchin.homework4;

public class MyWriter {
    public static void main(String[] args) {

        int times = 10;
        Printer printer = new Printer();
        new Thread(() -> {
            for (int i = 0; i < times; i++) {
                printer.printLetter('A');
            }
        }).start();

        new Thread(() -> {
            for (int i = 0; i < times; i++) {
                printer.printLetter('B');
            }
        }).start();

        new Thread(() -> {
            for (int i = 0; i < times; i++) {
                printer.printLetter('C');
            }
        }).start();

    }

}
