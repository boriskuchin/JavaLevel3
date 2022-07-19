package ru.bvkuchin.homework1.components;

import ru.bvkuchin.homework1.exceptions.IncorrectIndexExceptions;

import java.util.ArrayList;
import java.util.Arrays;

public class Utils {
    public static <T> void switchElements(T[] array, int i, int j) throws IncorrectIndexExceptions {
        if (i > array.length - 1 || j > array.length - 1 || i < 0 || j < 0) {
            throw new IncorrectIndexExceptions("Неверные индексы");
        }
        T tmp = null;
        tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

    public static <T> ArrayList<T> arrayToArrayList(T[] array) {
        ArrayList<T> list = new ArrayList<>();

        for (T t : array) {
            list.add(t);
        }
        return list;
    }

}
