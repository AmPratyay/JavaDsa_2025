package striver.sheet.patterns;

public class Pattern18 {

    public static void main(String[] args) {

        int n = 4;
        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j > i; j--) {
                System.out.print("   ");
            }

            char ch = 'A';
            int breakpoint = (2 * i + 1) / 2;
            for (char j = 1; j <= (2 * i + 1); j++) {
                System.out.print(" " + ch + " ");
                if (j <= breakpoint) {
                    ch++;
                } else {
                    ch--;
                }
            }

            System.out.println();
        }
    }
}
