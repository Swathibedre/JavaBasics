package leetcode;

import java.util.Arrays;

public class MergeArrays {
    public static void main(String[] args) {

        int n1[] = {0};
        int n2[] = {1};
        merge(n1, 0, n2, 1);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int l1 = m - 1, l2 = n - 1, totalLength = m + n - 1;
        while (l1 >= 0 && l2 >= 0) {
            nums1[totalLength--] = (nums1[l1] > nums2[l2]) ?
                    nums1[l1--] : nums2[l2--];
        }

        while (l2 >= 0) { //only need to combine with remaining nums2
            nums1[totalLength--] = nums2[l2--];
        }
        System.out.println(Arrays.toString(nums1));
    }
}
