package com.alevel.lesson4;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraySorting {
    public static void main(String[] args) {
        int[] arr = {4, -3, 2, 7, -11};

        int[] sortedArray = getSortedArray(arr);
        System.out.println(getMax(arr));
        System.out.println(Arrays.toString(sortedArray));
        System.out.println(Arrays.hashCode(arr));
        System.out.println(Arrays.toString(arr));
        if (Arrays.equals(arr, sortedArray)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }

    static int getMax(int... array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }
    static int[] getSortedArray(int... array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j+1]) {
                    int swap = array[j];
                    array[j] = array[j+1];
                    array[j+1] = swap;
                }
            }
        }
        return array;
    }
}
