package Lab1;

import Lab1.Document;

import java.util.Scanner;

public class Main {

    static Scanner scan;

    public static void main(String[] args) {
        System.out.println("START");
        scan = new Scanner(System.in);
        boolean halt = false;
        while (!halt) {
            String line = scan.nextLine();
            if (line.length() == 0 || line.charAt(0) == '#')
                continue;
            System.out.println("!" + line);
            String[] word = line.split(" ");
            if (word[0].equalsIgnoreCase("py") && word.length == 2) {
                int value = Integer.parseInt(word[1]);
                Drawer.drawPyramid(value);
                continue;
            }
            if (word[0].equalsIgnoreCase("ct") && word.length == 2) {
                int value = Integer.parseInt(word[1]);
                Drawer.drawChristmassTree(value);
                continue;
            }
            if (word[0].equalsIgnoreCase("ld") && word.length == 2) {
                Document.loadDocument(word[1], scan);
                continue;
            }
            if (word[0].equalsIgnoreCase("ha") && word.length == 1) {
                halt = true;
                continue;
            }
            System.out.println("Wrong command");
        }
        System.out.println("END OF EXECUTION");
        scan.close();
    }


}