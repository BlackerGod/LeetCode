//给定一个整数数组，找出总和最大的连续数列，并返回总和。 
//
// 示例： 
//
// 输入： [-2,1,-3,4,-1,2,1,-5,4]
//输出： 6
//解释： 连续子数组 [4,-1,2,1] 的和最大，为 6。
// 
//
// 进阶： 
//
// 如果你已经实现复杂度为 O(n) 的解法，尝试使用更为精妙的分治法求解。 
// Related Topics 数组 分治算法 动态规划 
// 👍 36 👎 0

package com.cute.leetcode.editor.cn;
public class ContiguousSequenceLcci {
    public static void main(String[] args) {
        Solution solution = new ContiguousSequenceLcci().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maxSubArray(int[] nums) {
        if(nums == null || nums.length == 0){
            return -1;
        }
        int result = nums[0];
        for (int i=1; i<nums.length; i++){
            nums[i] = Math.max(nums[i-1]+nums[i],nums[i]);
            if(nums[i] > result){
                result = nums[i];
            }
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}