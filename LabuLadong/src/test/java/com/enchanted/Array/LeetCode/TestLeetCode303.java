package com.enchanted.Array.LeetCode;

import org.junit.Test;

/**
 * @ClassName: TestLeetCode303
 * @Description: 区域和检索 - 数组不可变-测试用例
 * @PackageName:com.enchanted.Array.LeetCode
 * @Author Enchanted
 * @Date 2023/8/8 15:03
 * @Version 1.0
 */
public class TestLeetCode303 {
    @Test
    public void testLeetCode303() {
        int[] nums = {-2, 0, 3, -5, 2, -1};
        LeetCode303 leetCode303 = new LeetCode303(nums);
        System.out.println(leetCode303.sumRange(0, 2));
        System.out.println(leetCode303.sumRange(2, 5));
        System.out.println(leetCode303.sumRange(0, 5));
    }
}
