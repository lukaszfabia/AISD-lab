package Lab1;

public class Drawer {
    private static void drawLine(int n, char ch) {
        for (int i = 1; i <= n; i++) {
            System.out.print(ch);
        }
    }

    public static void drawPyramid(int n) {
        drawPyramidO(n,n);
    }

    private static void drawPyramidO(int i, int n){
        for (int j = 1; j <= i; j++) {
            drawLine(n - j, '.');
            drawLine(2 * j - 1, 'X');
            drawLine(n - j, '.');
            System.out.println();
        }
    }

    public static void drawChristmassTree(int n) {
        for (int i = 1; i <= n; i++) {
            drawPyramidO(i, n);
        }
    }

    public static void drawSq(int n) {
        drawLine(n, 'x');
        System.out.println();
        for (int i = 0; i < n - 2; i++) {
            System.out.print('x');
            drawLine(n - 2, '.');
            System.out.println('x');
        }
        drawLine(n, 'x');
        System.out.println();
    }


}