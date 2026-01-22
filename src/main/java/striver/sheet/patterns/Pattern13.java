package striver.sheet.patterns;

public class Pattern13 {

    public static void main(String[] args) {
        int n = 5;
        int val = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" " + val++ + " ");
            }
            System.out.println();
        }
    }
}
