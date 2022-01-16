package gfg;

import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
        ArrayList<Integer> val1 = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (!val1.contains(arr[i])) {
                for (int j = i + 1; j < n; j++) {
                    if (arr[i] == arr[j]) {
                        val1.add(arr[i]);
                        break;
                    }
                }
            }

        }
        Collections.sort(val1);
        boolean ans = val1.isEmpty();
        if (ans == true){
            val1.add(-1);}
        return val1;
        /**
         *
         *
         *
         */
    }
}
