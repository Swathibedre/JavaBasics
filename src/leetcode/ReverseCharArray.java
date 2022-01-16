package leetcode;

public class ReverseCharArray {
    public static void main(String[] args) {
     //   char c[] = {'h',"e","l","l","o"};
       // System.out.println(reverseString('s'));
    }
    public static void reverseString(char[] s) {
        char[] res= new char[s.length];
        for (int i = 1; i < s.length; i++) {
            res[i-1] = s[s.length - i + 1];
        }


    }
}
