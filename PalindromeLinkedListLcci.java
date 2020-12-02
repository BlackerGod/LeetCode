//编写一个函数，检查输入的链表是否是回文的。 
//
// 
//
// 示例 1： 
//
// 输入： 1->2
//输出： false 
// 
//
// 示例 2： 
//
// 输入： 1->2->2->1
//输出： true 
// 
//
// 
//
// 进阶： 
//你能否用 O(n) 时间复杂度和 O(1) 空间复杂度解决此题？ 
// Related Topics 链表 
// 👍 28 👎 0

package com.cute.leetcode.editor.cn;
public class PalindromeLinkedListLcci {
    public static void main(String[] args) {
        Solution solution = new PalindromeLinkedListLcci().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null){
            return true;
        }
        ListNode pHead = new ListNode(-1);
        ListNode tmp = null;
        ListNode cur = head;
        while (cur != null){
            if(pHead == null){
                pHead.next = new ListNode(cur.val);
            }else {
                tmp = new ListNode(cur.val);
                tmp.next = pHead.next;
                pHead.next = tmp;
            }
            cur = cur.next;
        }
        pHead = pHead.next;
        while(head != null){
            if(head.val != pHead.val){
                return false;
            }
            head = head.next;
            pHead = pHead.next;
        }
        return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}