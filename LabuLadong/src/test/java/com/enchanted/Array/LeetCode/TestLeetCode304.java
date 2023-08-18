package com.enchanted.Array.LeetCode;

import org.junit.Test;

/**
 * @ClassName: TestLeetCode304
 * @Description: 二维区域和检索 - 矩阵不可变-测试用例
 * @PackageName:com.enchanted.Array.LeetCode
 * @Author Enchanted
 * @Date 2023/8/9 09:11
 * @Version 1.0
 */
public class TestLeetCode304 {
    @Test
    public void testLeetCode304() {
        int[][] matrix = {{3, 0, 1, 4, 2},
                          {5, 6, 3, 2, 1},
                          {1, 2, 0, 1, 5},
                          {4, 1, 0, 1, 7},
                          {1, 0, 3, 0, 5}};
        LeetCode304 leetCode304 = new LeetCode304(matrix);
        System.out.println(leetCode304.sumRange(2, 1, 4, 3));
        System.out.println(leetCode304.sumRange(1, 1, 2, 2));
        System.out.println(leetCode304.sumRange(1, 2, 2, 4));
    }
}
