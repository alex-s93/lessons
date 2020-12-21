package com.alevel.lesson3_1;

import java.util.List;
import java.util.Scanner;

public class Lesson3_1 {
    public static void main(String[] args) {
//        System.out.println("I'm ready to read square equation params...");
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Please, set the value of 'a':");
//        int a = scanner.nextInt();
//
//        System.out.print("Please, set the value of 'b':");
//        int b = scanner.nextInt();
//
//        System.out.print("Please, set the value of 'c':");
//        int c = scanner.nextInt();
//
//        int discriminant = b * b - 4 * a * c;
//
//        if (discriminant > 0) {
//            System.out.println("We can calculate two roots of equation...");
//            double root1 = (-b + Math.sqrt(discriminant))/2*a;
//            double root2 = (-b - Math.sqrt(discriminant))/2*a;
//            System.out.println("Root 1 equals to " + root1 + ", root 2 equals to " + root2);
//            System.out.println("Root 1 equals to " + Math.round(root1) + ", root 2 equals to " + root2);
//        } else if (discriminant == 0) {
//            System.out.println("There is only one root...");
//        } else if (discriminant < 0) {
//            System.out.println("There are two roots in complex space...");
//        }

        int[] myArray = new int[10];

        for (int i = 0; i < 10; i++) {
            myArray[i] = i;
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("myArray[" + i + "] = " + myArray[i]);
        }

        int accumulator = 0;

        for (int i = 0; i < 10; i++) {
            accumulator = accumulator + myArray[i];
        }

        System.out.println("The sum of array numbers is " + accumulator);
    }
}
