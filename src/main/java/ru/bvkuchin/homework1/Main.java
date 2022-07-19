package ru.bvkuchin.homework1;

import ru.bvkuchin.homework1.components.Box;
import ru.bvkuchin.homework1.components.Utils;
import ru.bvkuchin.homework1.components.fruits.Apple;
import ru.bvkuchin.homework1.components.fruits.Orange;
import ru.bvkuchin.homework1.exceptions.IncorrectIndexExceptions;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        testswitchElements();
        testArrayToArrayList();
        testFruitBox();
    }

    private static void testFruitBox() {
        System.out.println("**************************Задание 3**************************");
        Box<Apple> appleBox1 = new Box<>();
        Box<Orange> orangeBox1 = new Box<>();

        appleBox1.addFruit(new Apple());
        appleBox1.addFruit(new Apple());
        appleBox1.addFruit(new Apple());
        appleBox1.addFruit(new Apple());
        appleBox1.addFruit(new Apple());

        orangeBox1.addFruit(new Orange());
        orangeBox1.addFruit(new Orange());
        orangeBox1.addFruit(new Orange());
        orangeBox1.addFruit(new Orange());

        System.out.println("Вес ящика с яблоками #1: " + appleBox1.getWeight());
        System.out.println("Вес ящика с апельсинами#1: " + orangeBox1.getWeight());
        System.out.println("Вес ящиков одинаковый? " + orangeBox1.compare(appleBox1));

        Box<Apple> appleBox2 = new Box<>();

        appleBox2.addFruit(new Apple());
        System.out.println("Вес ящика с яблоками #2: " + appleBox2.getWeight());
        System.out.println("Пересыпаем яблоки из ящика №1 в ящик №2");
        appleBox1.transfer(appleBox2);
        System.out.println("Вес ящика с яблоками #1 после пересыпания: " + appleBox1.getWeight());
        System.out.println("Вес ящика с яблоками #2 после пересыпания: " + appleBox2.getWeight());
        System.out.println("Теперь вес заполненных ящиков одинаковый? " + orangeBox1.compare(appleBox2));

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
        System.out.println();
    }
}