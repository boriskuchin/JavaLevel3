package ru.bvkuchin.homework4;

public class Printer {
    static int counter = 0;

    public synchronized void printLetter(char letter) {
        String printedLetter = String.valueOf(letter);

        while (counter % 3 != ((int) letter - ( int) 'A')) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        if (((int) letter - ( int) 'A') == 2) {
            printedLetter += " ";
        }
        System.out.print(printedLetter);
        counter++;
        notifyAll();
    }

}
