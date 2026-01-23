package striver.sheet.patterns;

public class Pattern20 {

    public static void printButterflyPattern(int n) {
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

        for (int k = 1; k < n; k++) {
            for (int j = n; j > k; j--) {
                System.out.print(" * ");
            }
            for (int j = 0; j < 2 * k; j++) {
                System.out.print("   ");
            }
            for (int j = n; j > k; j--) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int n = 5;
        printButterflyPattern(n);
    }
}
