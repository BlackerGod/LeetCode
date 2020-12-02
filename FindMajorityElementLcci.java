//数组中占比超过一半的元素称之为主要元素。给定一个整数数组，找到它的主要元素。若没有，返回-1。 
//
// 示例 1： 
//
// 输入：[1,2,5,9,5,9,5,5,5]
//输出：5 
//
// 
//
// 示例 2： 
//
// 输入：[3,2]
//输出：-1 
//
// 
//
// 示例 3： 
//
// 输入：[2,2,1,1,1,2,2]
//输出：2 
//
// 
//
// 说明： 
//你有办法在时间复杂度为 O(N)，空间复杂度为 O(1) 内完成吗？ 
// Related Topics 位运算 数组 分治算法 
// 👍 25 👎 0

package com.cute.leetcode.editor.cn;
public class FindMajorityElementLcci {
    public static void main(String[] args) {
        Solution solution = new FindMajorityElementLcci().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int majorityElement(int[] nums) {
        if(nums == null || nums.length <= 0){
            return -1;
        }
        int data = 0;
        int counts = 0;
        for (int i =0; i<nums.length; i++){
            if(counts == 0){
                counts++;
                data = nums[i];
            }else {
                if(data == nums[i]){
                    counts++;
                }else {
                    counts--;
                }
            }
        }
        if(counts > 0){
            int tmp = 0;
            for (int i=0; i<nums.length; i++){
                if(nums[i] == data){
                    tmp++;
                    if(tmp > nums.length/2){
                        return data;
                    }
                }
            }
        }
        return -1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}