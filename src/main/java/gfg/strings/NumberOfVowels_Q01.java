package gfg.strings;

import java.util.Scanner;

public class NumberOfVowels_Q01 {

    public static void printNumberOfVowels(String s) {
        if (s == null || s.isEmpty()) {
            System.out.println(0);
            return;
        }
        s = s.toLowerCase();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        printNumberOfVowels(s);
    }
}
