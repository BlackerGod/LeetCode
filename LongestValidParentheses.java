//给定一个只包含 '(' 和 ')' 的字符串，找出最长的包含有效括号的子串的长度。 
//
// 示例 1: 
//
// 输入: "(()"
//输出: 2
//解释: 最长有效括号子串为 "()"
// 
//
// 示例 2: 
//
// 输入: ")()())"
//输出: 4
//解释: 最长有效括号子串为 "()()"
// 
// Related Topics 字符串 动态规划 
// 👍 909 👎 0

package com.cute.leetcode.editor.cn;

import java.util.Stack;

public class LongestValidParentheses {
    public static void main(String[] args) {
        Solution solution = new LongestValidParentheses().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int longestValidParentheses(String s) {
        int result = 0;
        int last = -1;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else {
                if (stack.size() <= 0) {
                    last = i;
                } else {
                    stack.pop();
                    if(stack.size() > 0){
                        result = Math.max(result,i-stack.peek());
                    }else {
                        result = Math.max(result,i-last);
                    }
                }
            }
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}