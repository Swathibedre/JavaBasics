package leetcode;

import java.util.ArrayList;
import java.util.List;

public class HighestCandies {
    public static void main(String[] args) {
        int candies[] = {2,3,5,1,3};
        System.out.println(kidsWithCandies(candies,3));
    }
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> res = new ArrayList<>();
          for (int i = 0; i < candies.length; i++){
            int high = candies[i]+extraCandies;
            for(int j = 0; j < candies.length; j++){
                if (high < candies[j] ){
                    high = candies[j];
                    break;
                }
            }
            if(high == candies[i]+extraCandies) res.add(i,true);
            else res.add(i,false);
        }
        return res;
    }
}
