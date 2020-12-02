//给定一个非负整数 numRows，生成杨辉三角的前 numRows 行。 
//
// 
//
// 在杨辉三角中，每个数是它左上方和右上方的数的和。 
//
// 示例: 
//
// 输入: 5
//输出:
//[
//    [1],
//    [1,1],
//    [1,2,1],
//    [1,3,3,1],
//    [1,4,6,4,1]
//] 
// Related Topics 数组 
// 👍 336 👎 0

package com.cute.leetcode.editor.cn;

import java.util.LinkedList;
import java.util.List;

public class PascalsTriangle {
    public static void main(String[] args) {
        Solution solution = new PascalsTriangle().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new LinkedList<>();
        if(numRows == 0){
            return result;
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}