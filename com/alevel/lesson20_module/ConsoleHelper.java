package com.alevel.lesson20_module;

import java.util.Scanner;

class ConsoleHelper {
    private Scanner scanner = new Scanner(System.in);

    String getPathForSearch() {
        System.out.println("Please enter a search path if required:");
        String searchPath = scanner.nextLine();;
        if (searchPath.isEmpty()) {
            searchPath = System.getProperty("user.dir");
        }
        return searchPath;
    }

    String getRegularExpressionForFileSearch() {
        System.out.println("Please enter a regular expression for file search if required (regular expression should contains char \"*\" at first or last position):");
        String searchItem = scanner.nextLine();
        if (!searchItem.isEmpty() && !searchItem.contains("*")) {
            throw new RuntimeException("Incorrect regular expression");
        }
        return searchItem;
    }
}
