package com.alevel.lesson20_module;

import java.io.File;
import java.util.LinkedList;

public class FileSearch {
    public static void main(String[] args) {
        ConsoleHelper consoleHelper = new ConsoleHelper();
        String pathForSearch = consoleHelper.getPathForSearch();
        File directory = new File(pathForSearch);
        String searchItem = consoleHelper.getRegularExpressionForFileSearch();
        FilesHelper filesHelper = new FilesHelper(searchItem);

        LinkedList<File> files = filesHelper.getFiles(directory);

        filesHelper.printFiles(files);
    }
}
