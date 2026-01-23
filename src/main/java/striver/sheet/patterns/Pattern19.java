package striver.sheet.patterns;

public class Pattern19 {

    public static void printStarPyramid1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(" * ");
            }
            for (int j = 0; j < 2 * i; j++) {
                System.out.print("   ");
            }
            for (int j = n; j > i; j--) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void printStarPyramid2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" * ");
            }
            for (int j = 0; j < 2 * (n - i - 1); j++) {
                System.out.print("   ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int n = 5;
        printStarPyramid1(n);
        printStarPyramid2(n);
    }
}
