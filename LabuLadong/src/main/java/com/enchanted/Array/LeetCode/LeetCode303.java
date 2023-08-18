package com.enchanted.Array.LeetCode;

/**
 * @ClassName: LeetCode303
 * @Description: 区域和检索 - 数组不可变
 * @PackageName:com.enchanted.Array.LeetCode
 * @Author Enchanted
 * @Date 2023/8/8 15:01
 * @Version 1.0
 */
public class LeetCode303 {
    private int[] preSum;

    public LeetCode303(int[] nums) {
       preSum = new int[nums.length + 1];
       for (int i =  1; i < preSum.length; i++) {
           preSum[i] = preSum[i - 1] + nums[i - 1];
       }
    }

    public int sumRange(int left, int right) {
        return preSum[right + 1] - preSum[left];
    }


}
