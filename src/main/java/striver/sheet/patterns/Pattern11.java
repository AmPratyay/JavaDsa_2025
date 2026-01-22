package striver.sheet.patterns;

public class Pattern11 {

    public static void main(String[] args) {
        int n = 5;
        int val = 1;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) val = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(val);
                val = 1 - val;
            }
            System.out.println();
        }
    }
}
