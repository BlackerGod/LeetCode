//给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。 
//
// 示例 1： 
//
// 输入: "babad"
//输出: "bab"
//注意: "aba" 也是一个有效答案。
// 
//
// 示例 2： 
//
// 输入: "cbbd"
//输出: "bb"
// 
// Related Topics 字符串 动态规划 
// 👍 2579 👎 0

package com.cute.leetcode.editor.cn;
public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        Solution solution = new LongestPalindromicSubstring().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String longestPalindrome(String s) {
        if(s == null || s.length() <= 1){
            return s;
        }
        int slen = s.length();
        int start = 0;
        int end = 0;
        int length = 1;
        boolean[][] dp = new boolean[slen+1][slen+1];
        for (int i=1; i<slen; i++){
            for (int j=0; j<i; j++){
                if(s.charAt(i) == s.charAt(j) && ( i-j <=2 || dp[j+1][i-1])){
                    dp[j][i] = true;
                    if(i-j+1 > length){
                        start = j;
                        end = i;
                        length = i-j+1;
                    }
                }
            }
        }
        return s.substring(start,end+1);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}