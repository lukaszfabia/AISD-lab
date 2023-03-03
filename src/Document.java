import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Document {

    public static void loadDocument(String name) {
        try (Scanner scan = new Scanner(new File(name))) {
            while (scan.hasNext()) {
                String line = scan.nextLine();
                Scanner laneScan = new Scanner(line);
                while (laneScan.hasNext()) {
                    String word = laneScan.next();

                    if (correctLink(word.toLowerCase())) {
                        String word2 = word.toLowerCase().substring(5);
                        System.out.println(word2);
                    }
                }
            }
        } catch (FileNotFoundException f) {
            f.printStackTrace();
        }

    }

    public static boolean correctLink(String link) {
        if (link.length() >= 6) {
            String word = link.substring(0, 5);
            if (word.equals("link=")) {
                String[] letter = link.split("");
                char c = letter[5].charAt(0);
                return Character.isLetter(c);
            }
        }
        return false;
    }
}