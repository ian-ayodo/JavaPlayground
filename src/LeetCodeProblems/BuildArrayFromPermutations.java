package LeetCodeProblems.Arrays;

import java.util.Arrays;

public class BuildArrayFromPermutations {
    public static int[] buildArray(int[] nums) {
        int index = 0;
        int[] ans = new int[nums.length];
        for (int i = 0; i <= nums.length - 1; i++) {
            index = nums[i];
            for (int j = i; i <= nums.length; i++) {
                ans[j] = nums[index];
            }
        }
       
    }
}
