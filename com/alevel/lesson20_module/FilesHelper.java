package com.alevel.lesson20_module;

import java.io.File;
import java.util.LinkedList;

class FilesHelper {
    private String searchItem;

    FilesHelper(String searchItem) {
        this.searchItem = searchItem;
    }

    LinkedList<File> getFiles(File directory) {
        LinkedList<File> items = new LinkedList<>();
        File[] files = directory.listFiles();
        for (File item: files) {
            if (item.isFile() && item.getName().contains(searchItem.replace("*", ""))) {
                items.add(item);
            } else if (item.isDirectory()){
                items.add(item);
            }
        }
        return items;
    }

    void printFiles(LinkedList<File> files) {
        for (File item : files) {
            if (item.isFile()) {
                System.out.println(item.getAbsolutePath());
            } else if (item.isDirectory()) {
                printFiles(getFiles(item));
            }
        }
    }

}
