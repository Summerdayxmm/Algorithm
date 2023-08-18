package com.enchanted.Array.LeetCode;

import java.util.Enumeration;

/**
 * @ClassName: LeetCode304
 * @Description: 二维区域和检索 - 矩阵不可变
 * @PackageName:com.enchanted.Array.LeetCode
 * @Author Enchanted
 * @Date 2023/8/8 15:37
 * @Version 1.0
 */
public class LeetCode304 {
    private int[][] preSum;

    public LeetCode304(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        if (m == 0 || n == 0) {
            return;
        }
        preSum = new int[m + 1][n + 1];
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                preSum[i][j] = preSum[i - 1][j] + preSum[i][j - 1] - preSum[i - 1][j - 1] + matrix[i - 1][j - 1];
            }

        }
    }

    public int sumRange(int x1, int y1, int x2, int y2) {
        return preSum[x2 + 1][y2 + 1] - preSum[x1][y2 + 1] - preSum[x2 + 1][y1] + preSum[x1][y1];
    }
}
