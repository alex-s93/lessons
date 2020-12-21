package com.alevel.lesson5;

public class MultiArray {
    public static void main(String[] args) {
        int[][] array = {{2,4,3}, {1,3}};

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] +  " ");
            }
            System.out.println();
        }
    }
}
