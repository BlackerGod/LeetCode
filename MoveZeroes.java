//给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。 
//
// 示例: 
//
// 输入: [0,1,0,3,12]
//输出: [1,3,12,0,0] 
//
// 说明: 
//
// 
// 必须在原数组上操作，不能拷贝额外的数组。 
// 尽量减少操作次数。 
// 
// Related Topics 数组 双指针 
// 👍 688 👎 0

package com.cute.leetcode.editor.cn;
public class MoveZeroes {
    public static void main(String[] args) {
        Solution solution = new MoveZeroes().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
        public void swap(int[] arr,int left,int right){
            int tmp = arr[left];
            arr[left] = arr[right];
            arr[right] = tmp;
        }
    public void moveZeroes(int[] nums) {
        if(nums == null || nums.length <= 1){
            return;
        }
        /*int left = 0;
        int counts = 0;
        int right = 0;
        while (left < nums.length && nums[left] != 0){
            left++;
        }
        if(left == nums.length){
            return;
        }
        right = left + 1;
        while (left < nums.length){

        }*/
        for (int i=0; i<nums.length-1; i++){
            if(nums[i] != 0){
                continue;
            }
            int j=i+1;
            for (; j<nums.length; j++){
                if(nums[j] != 0){
                    break;
                }
            }
            if(j != nums.length){
                swap(nums,i,j);
            }
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}