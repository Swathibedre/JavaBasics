package leetcode;

public class PalindromeString {
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }

    public static boolean isPalindrome(String s) {

        String reverse = "";
        s = s.replaceAll("[^a-zA-Z0-9]", " ");
        s = s.replaceAll("\\s", "");
        int n = s.length();
        char ch;
        for (int i = 0; i < n; i++){
           ch = s.charAt(i);
            reverse = ch+reverse;
             }
        System.out.println(reverse);
        System.out.println(s);

        if (reverse.equalsIgnoreCase(s)) return true;
        else return false;

    }
}
