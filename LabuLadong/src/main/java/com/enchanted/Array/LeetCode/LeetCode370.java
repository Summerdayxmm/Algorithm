package com.enchanted.Array.LeetCode;

/**
 * @ClassName: LeetCode370
 * @Description: 区间加法
 * @PackageName:com.enchanted.Array.LeetCode
 * @Author Enchanted
 * @Date 2023/8/28 07:10
 * @Version 1.0
 */
// git test
 public class LeetCode370 {
     public int[] getModifiedArray(int length, int[][] updates) {
         int[] nums = new int[length];
         Difference df = new Difference(nums);
         for(int[] update: updates) {
             int i = update[0];
             int j = update[1];
             int val = update[2];
             df.increment(i, j, val);
         }

         return df.result();

     }
 }

 class Difference {
     private int[] diff;

     public Difference(int[] nums) {
         assert nums.length > 0;
         diff = new int[nums.length];
         diff[0] = nums[0];
         for (int i = 1; i < nums.length; i++) {
             diff[i] = nums[i] - nums[i - 1];
         }
     }

     public void increment(int i, int j, int val) {
         diff[i] += val;
         if(j + 1 < diff.length) {
             diff[j + 1] -= val;
         }
     }

     public int[] result() {
         int[] res = new int[diff.length];
         res[0] = diff[0];
         for (int i = 1; i < diff.length; i++) {
             res[i] = res[i - 1] + diff[i];
         }
         return res;
     }
 }


