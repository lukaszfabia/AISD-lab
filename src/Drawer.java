public class Drawer {

    private static void drawLine(int n, char ch) {
        for (int i = 1; i <= n; i++) {
            System.out.print(ch);
        }
    }

    public static void drawPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            drawLine(n - i, '.');
            drawLine(2 * i - 1, 'X');
            drawLine(n - i, '.');
            System.out.println();
        }
    }

    public static void drawChristmassTree(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=i; j++) {
                drawLine(n - j, '.');
                drawLine(2 * j - 1, 'X');
                drawLine(n - j, '.');
                System.out.println();
            }
        }
    }


}