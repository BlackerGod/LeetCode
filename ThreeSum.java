//给你一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？请你找出所有满足条件且不重复
//的三元组。 
//
// 注意：答案中不可以包含重复的三元组。 
//
// 
//
// 示例： 
//
// 给定数组 nums = [-1, 0, 1, 2, -1, -4]，
//
//满足要求的三元组集合为：
//[
//  [-1, 0, 1],
//  [-1, -1, 2]
//]
// 
// Related Topics 数组 双指针 
// 👍 2462 👎 0

package com.cute.leetcode.editor.cn;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        Solution solution = new ThreeSum().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new LinkedList<>();
        if(nums == null || nums.length < 3){
            return result;
        }
        List<Integer> tmp;
        for (int i=0; i<nums.length-2; i++){
            for (int j=i+1; j<nums.length-1; j++){
                for (int k=j+1; k<nums.length; k++){
                    if((nums[i]+nums[j]+nums[k]) == 0){
                        tmp = new LinkedList<>();
                        tmp.add(nums[i]);
                        tmp.add(nums[j]);
                        tmp.add(nums[k]);
                        if(!result.containsAll(tmp)) {
                            result.add(tmp);
                        }
                    }
                }
            }
        }

        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}