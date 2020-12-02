//给定一个有序整数数组，元素各不相同且按升序排列，编写一个算法，创建一棵高度最小的二叉搜索树。示例: 给定有序数组: [-10,-3,0,5,9], 一个可能
//的答案是：[0,-3,9,-10,null,5]，它可以表示下面这个高度平衡二叉搜索树：           0          / \        -3 
//  9        /   /      -10  5 Related Topics 树 深度优先搜索 
// 👍 44 👎 0

package com.cute.leetcode.editor.cn;
public class MinimumHeightTreeLcci {
    public static void main(String[] args) {
        Solution solution = new MinimumHeightTreeLcci().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return dfs(nums,0,nums.length-1);
    }

    public TreeNode dfs(int[] nums,int low,int high){
        if(low > high){
            return null;
        }
        int mid = (high-low)/2 +low;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = dfs(nums,low,mid-1);
        root.right = dfs(nums,mid+1,high);
        return root;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}