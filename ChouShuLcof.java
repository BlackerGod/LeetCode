//我们把只包含质因子 2、3 和 5 的数称作丑数（Ugly Number）。求按从小到大的顺序的第 n 个丑数。 
//
// 
//
// 示例: 
//
// 输入: n = 10
//输出: 12
//解释: 1, 2, 3, 4, 5, 6, 8, 9, 10, 12 是前 10 个丑数。 
//
// 说明: 
//
// 
// 1 是丑数。 
// n 不超过1690。 
// 
//
// 注意：本题与主站 264 题相同：https://leetcode-cn.com/problems/ugly-number-ii/ 
// Related Topics 数学 
// 👍 56 👎 0

package com.cute.leetcode.editor.cn;

import java.util.PriorityQueue;
import java.util.Queue;

public class ChouShuLcof {
    public static void main(String[] args) {
        Solution solution = new ChouShuLcof().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {

        private int[] uglyNumber = {2,3,5};

        public int nthUglyNumber(int n) {
            Queue<Long> queue = new PriorityQueue<>();
            queue.add(1L);
            int count = 0;
            while (!queue.isEmpty()){
                long cur = queue.poll();
                while (++count >= n){
                    return (int) cur;
                }
                for (int i : uglyNumber){
                    if(!queue.contains(cur*i)){
                        queue.add(cur*i);
                    }
                }
            }
            return -1;
        }
}
//leetcode submit region end(Prohibit modification and deletion)

}