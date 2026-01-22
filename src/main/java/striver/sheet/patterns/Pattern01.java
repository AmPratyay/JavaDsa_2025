package striver.sheet.patterns;

import java.util.Scanner;

public class Pattern01 {

//             *  *  *  *  *
//             *  *  *  *  *
//             *  *  *  *  *
//             *  *  *  *  *
//             *  *  *  *  *

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number n : ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
