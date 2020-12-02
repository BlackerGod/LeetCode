//三步问题。有个小孩正在上楼梯，楼梯有n阶台阶，小孩一次可以上1阶、2阶或3阶。实现一种方法，计算小孩有多少种上楼梯的方式。结果可能很大，你需要对结果模100
//1000000007。
//
// 示例1: 
//
// 
// 输入：n = 3 
// 输出：4
// 说明: 有四种走法
// 
//
// 示例2: 
//
// 
// 输入：n = 5
// 输出：13
// 
//
// 提示: 
//
// 
// n范围在[1, 1000000]之间 
// 
// Related Topics 动态规划 
// 👍 19 👎 0

package com.cute.leetcode.editor.cn;
public class ThreeStepsProblemLcci {
    public static void main(String[] args) {
        Solution solution = new ThreeStepsProblemLcci().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int waysToStep(int n) {
        if(n < 0){
            return -1;
        }
        int[] result = new int[]{0,1,2,4};
        if(n < 4){
            return result[n];
        }
        for (int i=4; i<=n; i++){
            result[0] = result[1]%1000000007;
            result[1] = result[2]%1000000007;
            result[2] = result[3]%1000000007;
            result[3] = (result[0]+result[1])%1000000007+result[2]%1000000007;
        }
        return result[3]%1000000007;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}