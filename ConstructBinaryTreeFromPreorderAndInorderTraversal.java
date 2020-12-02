//根据一棵树的前序遍历与中序遍历构造二叉树。 
//
// 注意: 
//你可以假设树中没有重复的元素。 
//
// 例如，给出 
//
// 前序遍历 preorder = [3,9,20,15,7]
//中序遍历 inorder = [9,3,15,20,7] 
//
// 返回如下的二叉树： 
//
//     3
//   / \
//  9  20
//    /  \
//   15   7 
// Related Topics 树 深度优先搜索 数组 
// 👍 631 👎 0

package com.cute.leetcode.editor.cn;

import java.util.HashMap;

public class ConstructBinaryTreeFromPreorderAndInorderTraversal {
    public static void main(String[] args) {
        Solution solution = new ConstructBinaryTreeFromPreorderAndInorderTraversal().new Solution();
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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i=0; i<inorder.length; i++){
            map.put(inorder[i],i);
        }
        return build(preorder,0,preorder.length,inorder,0,inorder.length,map);
    }

    public TreeNode build(int[] preorder,int start1,int end1,
                          int[] order,int start2,int end2,HashMap<Integer,Integer> map){
        if(start1 == end1){
            return null;
        }
        int rootVal = preorder[start1];
        TreeNode root = new TreeNode(rootVal);
        int rootIndex = map.get(rootVal);
        int leftNum = rootIndex - start2;
        root.left = build(preorder,start1+1,start1+leftNum+1,order,start2,rootIndex,map);
        root.right = build(preorder,start1+leftNum+1,end1,order,rootIndex+1,end2,map);
        return root;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}