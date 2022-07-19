package ru.bvkuchin.homework1;

import ru.bvkuchin.homework1.components.Utils;
import ru.bvkuchin.homework1.exceptions.IncorrectIndexExceptions;

import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        testswitchElements();
        testArrayToArrayList();
    }



    private static void testswitchElements() {
        System.out.println("**************************Задание 1**************************");
        String[] str = "а я иду гуляю по москве".split("\\s+");

        System.out.println(Arrays.toString(str));
        try {
            Utils.<String>switchElements(str, 5, 0);
            System.out.println(Arrays.toString(str));
        } catch (IncorrectIndexExceptions e) {
            e.printStackTrace();
        }

        System.out.println();
        Integer[] integers = {1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(integers));
        try {
            Utils.<Integer>switchElements(integers, 5, 0);
            System.out.println(Arrays.toString(integers));
        } catch (IncorrectIndexExceptions e) {
            e.printStackTrace();
        }

        System.out.println();
        Exception[] exceptions = {new Exception("1"),new Exception("2"),new Exception("3"),new Exception("4"),new Exception("5"),new Exception("6")};
        System.out.println(Arrays.toString(exceptions));
        try {
            Utils.<Exception>switchElements(exceptions, 5, 0);
            System.out.println(Arrays.toString(exceptions));
        } catch (IncorrectIndexExceptions e) {
            e.printStackTrace();
        }
        System.out.println();
    }

    private static void testArrayToArrayList() {
        System.out.println("**************************Задание 2**************************");
        String[] str = "а я иду гуляю по москве".split("\\s+");
        Integer[] integers = {1, 2, 3, 4, 5, 6};
        Exception[] exceptions = {new Exception("1"),new Exception("2"),new Exception("3"),new Exception("4"),new Exception("5"),new Exception("6")};

        System.out.println(Utils.<String>arrayToArrayList(str).getClass().getSimpleName() + ": " + Utils.<String>arrayToArrayList(str).toString());
        System.out.println(Utils.<Integer>arrayToArrayList(integers).getClass().getSimpleName() + ": " +Utils.<Integer>arrayToArrayList(integers));
        System.out.println(Utils.<Exception>arrayToArrayList(exceptions).getClass().getSimpleName() + ": " +Utils.<Exception>arrayToArrayList(exceptions));

    }
}