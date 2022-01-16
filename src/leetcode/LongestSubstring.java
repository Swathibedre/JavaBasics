package leetcode;

public class LongestSubstring {

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("pwwke"));
    }

    public static int lengthOfLongestSubstring(String s) {
        String res = s.substring(0,1);
        String res1 = "";
        for (int i = 1; i < s.length(); i++) {
            char curr = s.charAt(i);
            if(!res.contains(String.valueOf(curr))) res = s.substring(0 , i+1);
            else res1 = s.substring(i,i+1);
        }

        if(res.length()>res1.length())  return res.length();
        else  return res1.length();

    }

}
