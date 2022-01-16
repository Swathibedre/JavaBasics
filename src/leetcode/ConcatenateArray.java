package leetcode;

import java.util.Arrays;

public class ConcatenateArray {
    public static void main(String[] args) {
        int n[] ={1,2,1};
        System.out.println(Arrays.toString(getConcatenation(n)));
    }
    public static int[] getConcatenation(int[] nums) {
        int res[] = new int[nums.length*2];
        for (int i =0;i<nums.length*2 ;i++){
            if(i>nums.length-1){
                res[i] = nums[i-nums.length];
            }
            else{res[i] = nums[i];};

        }
        return res;
    }
}
