package com.alevel.lesson8_module;

public class DifferentElementsOfArray {
    public static void main(String[] args) {
        int[] array = {1,4,5,1,1,3};
        int[] verifiedArray = new int[array.length];

        int newIndex = 0;

        for (int i = 0; i < array.length; i++) {
            if (!contains(verifiedArray, array[i])) {
                verifiedArray[newIndex] = array[i];
                newIndex++;
            }
        }

        int quantityOfDifferentNumbers = 0;

        if (contains(array, 0)) {
            quantityOfDifferentNumbers++;
        }

        for (int i = 0; i < verifiedArray.length; i++) {
            if (verifiedArray[i] != 0) {
                quantityOfDifferentNumbers++;
            }
        }

        System.out.println("Quantity of different numbers is: " + quantityOfDifferentNumbers);
    }

    static boolean contains(int[] array, int value) {
        boolean result = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                result = true;
                break;
            }
        }
        return result;
    }
}
