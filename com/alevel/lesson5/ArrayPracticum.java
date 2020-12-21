package com.alevel.lesson5;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayPracticum {
    public static void main(String[] args) {
        int[] array = {1, 7, -4, -10, 5, 10, 0};
        int[][] arrayTwo = {{}, {}, {}};
        System.out.println(Arrays.toString(array));

        System.out.println(Arrays.toString(insertSort(array)));

        //        int arraySize = 9;
//        int[] array = createArray(arraySize);
//        System.out.println(Arrays.toString(array));

//        int max = findMax(array);
//        int min = findMin(array);
//        System.out.println(max);
//        System.out.println(min);

//        for (int i = 0; i < array.length; i+=2) {
//            if (i + 1 >= array.length) {
//              break;
//            }
//            int swap = array[i];
//            array[i] = array[i+1];
//            array[i+1] = swap;
//        }
//        System.out.println(Arrays.toString(array));
    }

    private static int[] createArray(int arraySize) {
        int[] array = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            array[i] = i;
        }
        return array;
    }

    private static int findMax(int[] numbers) {
        if (numbers.length == 0) {
            return -1;
        }

        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        return max;
    }

    private static int findMin(int[] numbers) {
        if (numbers.length == 0) {
            return -1;
        }

        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        return min;
    }

    private static int[] sort(int[] numbers) {
        int[] sortedNumbers = new int[numbers.length];
        int counter = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                sortedNumbers[counter] = numbers[i];
                counter++;
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 0) {
                sortedNumbers[counter] = numbers[i];
                counter++;
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                sortedNumbers[counter] = numbers[i];
                counter++;
            }
        }

        return sortedNumbers;
    }

    static int[] insertSort(int[] arr) {
        for (int min = 0; min < arr.length - 1; min++) {
            int least = min;
            for (int j = min + 1; j < arr.length; j++) {
                if (arr[j] < arr[least]) {
                    least = j;
                }
            }
            int tmp = arr[min];
            arr[min] = arr[least];
            arr[least] = tmp;
        }
        return arr;
    }

}
