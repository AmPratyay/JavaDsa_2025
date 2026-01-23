package striver.sheet.patterns;

public class Pattern17 {

    public static void main(String[] args) {
        int n = 5;
        for (char ch = 'A'; ch < 'A' + n; ch++) {
            for (int j = 'A'; j <= ch; j++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
