package leetcode;

public class ReplaceDigits {
    public static void main(String[] args) {
        System.out.println(replaceDigits("a1c1e1"));
    }
    public static String replaceDigits(String s) {
        char[] arr = s.toCharArray();
        for (int i = 1; i < s.length(); i=i+2){
            arr[i] = shift(arr[i-1],arr[i]);
        }

        return String.valueOf(arr);
    }

    public static char shift(char c,char d){
        int n = c+Integer.parseInt(String.valueOf(d));
        System.out.println((char)n);
        return (char)n;
    }
}
