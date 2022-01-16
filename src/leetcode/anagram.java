package leetcode;

import java.util.Arrays;

public class anagram {

    public static void main(String[] args) {

        System.out.println(isAnagram("aacc","ccac"));

    }

    public static boolean isAnagram(String s, String t) {
        boolean flag = false;

        if(s.length() != t.length())
            return false;

        char s1[] = s.toCharArray();
        char t1[] = t.toCharArray();


        Arrays.sort(s1);
        Arrays.sort(t1);

        String s2= new String(s1);
        String t2= new String(t1);

        // Compare sorted strings
        for (int i = 0; i < s.length(); i++)
            if (s2.charAt(i) != t2.charAt(i))
                return false;

        return true;
    }
}
