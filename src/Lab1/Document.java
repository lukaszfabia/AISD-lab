package Lab1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Document {
    public static void loadDocument(String name, Scanner scan) {
        String line = "";
        List<String> list = new LinkedList<>();

        while (!line.equals("eod")) {
            line = scan.nextLine();

            String[] words = line.split("\\s+");
            for (String word : words) {
                if (correctLink(word.toLowerCase())) {
                    list.add(word.substring(5).toLowerCase());
                }
            }
        }

        for (String s : list) {
            System.out.println(s);
        }
    }
    private static boolean correctLink(String link) {
        return link.matches("link=[a-zA-Z][a-zA-Z0-9_]*");
    }
}