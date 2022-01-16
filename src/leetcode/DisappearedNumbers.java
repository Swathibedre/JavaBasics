package leetcode;

import java.util.ArrayList;
import java.util.List;

public class DisappearedNumbers {

    public static void main(String[] args) {
        int n[] = {1,1,2,1,2,3};
        System.out.println(findDisappearedNumbers(n));
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        int length = nums.length;
        List<Integer> res = new ArrayList<Integer>();
        int indexArray[] = new int[length+1];

        for (int i = 0 ; i < length; i++){
            indexArray[nums[i]] = 1;
        }

        for (int j = 1; j <= length; j++) {
            if (indexArray[j] == 0) res.add(j);
        }

        return(res);
    }
}
