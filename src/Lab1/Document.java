package Lab1;


import java.util.Scanner;

public class Document {
    public static void loadDocument(String name, Scanner scan) {
        String line = "";

        while (!line.equals("eod")) {
            line = scan.nextLine();

            String[] words = line.split("\\s+");
            for (String word : words) {
                if (correctLink(word.toLowerCase())) {
                    System.out.println(word.substring(5).toLowerCase());
                }
            }
        }
    }

    private static boolean correctLink(String link) {
        return link.matches("link=[a-zA-Z][a-zA-Z0-9_]*");
    }
}