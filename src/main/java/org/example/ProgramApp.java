package org.example;

import java.util.HashMap;

public class ProgramApp {
    public static void main(String[] args) {
        HashMap<String, String> hashmap = new HashMap<>();
        hashmap.put("f.e", "for example");
        hashmap.put("etc.", "and so on");
        hashmap.put("i.e", "more precisely");

        Program.printKeys(hashmap);
        System.out.println("---");
        Program.printKeysWhere(hashmap, "i");
        System.out.println("---");
        Program.printValuesOfKeysWhere(hashmap, ".e");

        HashMap<String, Book> hashmap2 = new HashMap<>();
        hashmap2.put("sense", new Book("Sense and Sensibility", 1811, "..."));
        hashmap2.put("prejudice", new Book("Pride and prejudice", 1813, "...."));

        Program.printValues(hashmap2);
        System.out.println("---");
        Program.printValueIfNameContains(hashmap2, "prejud");
    }
}
