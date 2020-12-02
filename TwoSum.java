//给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。 
//
// 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。 
//
// 
//
// 示例: 
//
// 给定 nums = [2, 7, 11, 15], target = 9
//
//因为 nums[0] + nums[1] = 2 + 7 = 9
//所以返回 [0, 1]
// 
// Related Topics 数组 哈希表 
// 👍 8834 👎 0

package com.cute.leetcode.editor.cn;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        Solution solution = new TwoSum().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] twoSum(int[] nums, int target) {
        if(nums == null || nums.length <= 1){
            return null;
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
                map.put(nums[i],i);
        }
        int tmp = 0;
        for (Map.Entry<Integer,Integer> entry : map.entrySet()){
            tmp = target - entry.getKey();
            if(map.containsKey(tmp)){
                return new int[]{entry.getValue(),map.get(tmp)};
            }
        }
        return null;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}