package com.alevel.lesson8_module;

import java.util.Arrays;
import java.util.Scanner;

public class ChessKnight {
    public static void main(String[] args) {
        String[][] chessDesk = {
                {"A8", "B8", "C8", "D8", "E8", "F8", "G8", "H8"},
                {"A7", "B7", "C7", "D7", "E7", "F7", "G7", "H7"},
                {"A6", "B6", "C6", "D6", "E6", "F6", "G6", "H6"},
                {"A5", "B5", "C5", "D5", "E5", "F5", "G5", "H5"},
                {"A4", "B4", "C4", "D4", "E4", "F4", "G4", "H4"},
                {"A3", "B3", "C3", "D3", "E3", "F3", "G3", "H3"},
                {"A2", "B2", "C2", "D2", "E2", "F2", "G2", "H2"},
                {"A1", "B1", "C1", "D1", "E1", "F1", "G1", "H1"}
        };

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the start position of the knight:");
        String startPosition = in.nextLine();

        System.out.println("Enter the finish position of the knight:");
        String finishPosition = in.nextLine();

        printPossibilityToMakeMove(chessDesk, startPosition, finishPosition);
    }

    static int[] indexOfElement(String[][] array, String value) {
        int firstIndex = 0;
        int secondIndex = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j].equals(value)) {
                    firstIndex = i;
                    secondIndex = j;
                    break;
                }
            }

        }
        return new int[]{firstIndex, secondIndex};
    }

    static void printPossibilityToMakeMove(String[][] array, String startPosition, String finishPosition) {
        int[] startPoint = indexOfElement(array, startPosition);
        int[] finishPoint = indexOfElement(array, finishPosition);

        int[][] possibleMoves = generatePossibleMoves(startPoint);
        if (contains(possibleMoves, finishPoint)) {
            System.out.println("Move is possible");
        } else {
            System.out.println("Move is impossible");
        }
    }

    static int[][] generatePossibleMoves(int[] startPoint) {
        int[][] possible = new int[8][2];

        // I think that possible to optimize code below but I don't have enough time for it
        possible[0] = new int[]{(startPoint[0] - 2), (startPoint[1] + 1)};
        possible[1] = new int[]{(startPoint[0] - 2), (startPoint[1] - 1)};
        possible[2] = new int[]{(startPoint[0] - 1), (startPoint[1] + 2)};
        possible[3] = new int[]{(startPoint[0] - 1), (startPoint[1] - 2)};
        possible[4] = new int[]{(startPoint[0] + 1), (startPoint[1] + 2)};
        possible[5] = new int[]{(startPoint[0] + 1), (startPoint[1] - 2)};
        possible[6] = new int[]{(startPoint[0] + 2), (startPoint[1] + 1)};
        possible[7] = new int[]{(startPoint[0] + 2), (startPoint[1] - 1)};

        return possible;
    }

    static boolean contains(int[][] array, int[] point) {
        boolean result = false;
        for (int i = 0; i < array.length; i++) {
            if (Arrays.equals(array[i], point)) {
                result = true;
                break;
            }
        }
        return result;
    }
}
