package Lab2;

import java.util.Scanner;

public class Document {
    public String name;
    public OneWayLinkedList<Link> links;

    public Document(String name, Scanner scan) {
        this.name = name;
        this.links = new OneWayLinkedList<>();

        load(scan);
    }

    public void load(Scanner scan) {
        String input;
        while (!(input = scan.nextLine()).equalsIgnoreCase("eod")) {
            String[] arr = input.split("\\s+");

            for (String word : arr) {
                if (correctLink(word)) {
                    links.add(new Link(word.substring(5).toLowerCase()));
                }
            }
        }
    }
    private static boolean correctLink(String link) {
        return link.toLowerCase().matches("link=[a-zA-Z][a-zA-Z0-9_]*$");
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
