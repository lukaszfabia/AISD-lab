package Lab2;

import java.util.Scanner;

public class Document {
    private final String name;
    public OneWayLinkedList<Link> links;

    public Document(String name, Scanner scan) {
        this.name = name;
        this.links = new OneWayLinkedList<>();
        load(scan);
    }

    public void load(Scanner scan) {
        String line = "";

        while (!line.equals("eod")) {
            line = scan.nextLine();

            String[] words = line.split("\\s+");
            for (String word : words) {
                if (correctLink(word.toLowerCase())) {
                    links.add(new Link(word.substring(5).toLowerCase()));
                }
            }
        }
    }
    private static boolean correctLink(String link) {
        return link.matches("link=[a-zA-Z][a-zA-Z0-9_]*");
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Document: ").append(name);
        for (Link link : links) {
            builder.append("\n").append(link);
        }
        return builder.toString();
    }

}
