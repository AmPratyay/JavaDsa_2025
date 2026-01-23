package gfg.strings;

public class PalindromeCheck_Q02 {

    public static boolean checkPalindrome(String str) {
        if (str == null) return false;
        str = str.toLowerCase();
        int i = 0;
        int j = str.length() - 1;

        while (i < j) {            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(checkPalindrome("momo"));
    }
}
