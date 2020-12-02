//给定一个字符串，你的任务是计算这个字符串中有多少个回文子串。 
//
// 具有不同开始位置或结束位置的子串，即使是由相同的字符组成，也会被视作不同的子串。 
//
// 
//
// 示例 1： 
//
// 输入："abc"
//输出：3
//解释：三个回文子串: "a", "b", "c"
// 
//
// 示例 2： 
//
// 输入："aaa"
//输出：6
//解释：6个回文子串: "a", "a", "a", "aa", "aa", "aaa" 
//
// 
//
// 提示： 
//
// 
// 输入的字符串长度不会超过 1000 。 
// 
// Related Topics 字符串 动态规划 
// 👍 340 👎 0

package com.cute.leetcode.editor.cn;
public class PalindromicSubstrings {
    public static void main(String[] args) {
        Solution solution = new PalindromicSubstrings().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int countSubstrings(String s) {
        if(s == null || s.length() == 0){
            return 0;
        }
        int result = 0;
        int strlen = s.length();
        boolean[][] dp = new boolean[strlen+1][strlen+1];
        for (int i=1; i<s.length(); i++){
            for (int j=0; j<i; j++){
                if(s.charAt(i) == s.charAt(j) && (i-j <=2 || dp[j+1][i-1])){
                    dp[j][i] = true;
                    result++;
                }
            }
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}