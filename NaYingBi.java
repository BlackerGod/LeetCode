//桌上有 n 堆力扣币，每堆的数量保存在数组 coins 中。我们每次可以选择任意一堆，拿走其中的一枚或者两枚，求拿完所有力扣币的最少次数。 
//
// 示例 1： 
//
// 
// 输入：[4,2,1] 
//
// 输出：4 
//
// 解释：第一堆力扣币最少需要拿 2 次，第二堆最少需要拿 1 次，第三堆最少需要拿 1 次，总共 4 次即可拿完。 
// 
//
// 示例 2： 
//
// 
// 输入：[2,3,10] 
//
// 输出：8 
// 
//
// 限制： 
//
// 
// 1 <= n <= 4 
// 1 <= coins[i] <= 10 
// 
// 👍 7 👎 0

package com.cute.leetcode.editor.cn;
public class NaYingBi {
    public static void main(String[] args) {
        Solution solution = new NaYingBi().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int minCount(int[] coins) {
        if(coins == null || coins.length == 0){
            return 0;
        }
        int result = 0;
        for (int i=0; i<coins.length; i++){
            result += coins[i]/2 + coins[i]%2;
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}