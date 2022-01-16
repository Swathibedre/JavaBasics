package leetcode;

import java.util.Arrays;

public class RearrangeSentence {
    public static void main(String[] args) {
        System.out.println(sortSentence("is2 sentence4 This1 a3"));
    }

    public static String sortSentence(String s) {
        String[] words=s.split(" ");
        String res[] = new String[words.length];


        for (String w : words) {
            int n = w.charAt(w.length()-1)-'0' ;
            res[n-1] = w.substring(0,w.length()-1);
        }

//        String result= Arrays.toString(res).replaceAll(",","");
//        return result.substring(1,result.length()-1);
//        StringBuilder sb = new StringBuilder();
//        for(String str : res)
//            sb.append(' ').append(str);
//        return sb.substring(1);

        String r = "";
        for (String str:res) {
            r+=" "+str;

        }
        return r.substring(1);
    }
}
