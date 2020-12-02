//编写一个高效的算法来搜索 m x n 矩阵 matrix 中的一个目标值 target。该矩阵具有以下特性： 
//
// 
// 每行的元素从左到右升序排列。 
// 每列的元素从上到下升序排列。 
// 
//
// 示例: 
//
// 现有矩阵 matrix 如下： 
//
// [
//  [1,   4,  7, 11, 15],
//  [2,   5,  8, 12, 19],
//  [3,   6,  9, 16, 22],
//  [10, 13, 14, 17, 24],
//  [18, 21, 23, 26, 30]
//]
// 
//
// 给定 target = 5，返回 true。 
//
// 给定 target = 20，返回 false。 
// Related Topics 二分查找 分治算法 
// 👍 409 👎 0

package com.cute.leetcode.editor.cn;
public class SearchA2dMatrixIi {
    public static void main(String[] args) {
        Solution solution = new SearchA2dMatrixIi().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0){
            return false;
        }
        int curX = 0;
        int curY = matrix[0].length-1;
        while (curX >= 0 && curY >= 0 && curX < matrix.length && curY < matrix[0].length){
            if(matrix[curX][curY] == target){
                return true;
            }else if (matrix[curX][curY] > target){
                curY--;
            }else {
                curX++;
            }
        }
        return false;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}