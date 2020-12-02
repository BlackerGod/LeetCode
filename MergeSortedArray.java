//给你两个有序整数数组 nums1 和 nums2，请你将 nums2 合并到 nums1 中，使 nums1 成为一个有序数组。 
//
// 
//
// 说明: 
//
// 
// 初始化 nums1 和 nums2 的元素数量分别为 m 和 n 。 
// 你可以假设 nums1 有足够的空间（空间大小大于或等于 m + n）来保存 nums2 中的元素。 
// 
//
// 
//
// 示例: 
//
// 输入:
//nums1 = [1,2,3,4,7,0], m = 3
//nums2 = [2,5,6],       n = 3
//
//输出: [1,2,2,3,5,6] 
// Related Topics 数组 双指针 
// 👍 588 👎 0

package com.cute.leetcode.editor.cn;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        Solution solution = new MergeSortedArray().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(m == 0 && n == 0){
            return;
        }
        if(n == 0){
            return;
        }

        /*int index = 0;
        for (int i=0; i<n; i++){
            nums1[m++] = nums2[i];
        }
        Arrays.sort(nums1);*/
        int left = 0;
        int right = 0;
        while (left < m ){
            if(nums1[left] > nums2[right]){
                swap(nums1,left,nums2,right);
                while (right < nums2.length)
                //right++;
            }
            left++;
        }
        while (left < nums1.length){
            nums1[left++] = nums2[right++];
        }
    }

    public void swap(int[] arr,int left,int[] arr2,int right){
        int tmp = arr[left];
        arr[left] = arr2[right];
        arr2[right] = tmp;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}