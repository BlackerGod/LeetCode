//给定两个字符串 s1 和 s2，请编写一个程序，确定其中一个字符串的字符重新排列后，能否变成另一个字符串。 
//
// 示例 1： 
//
// 输入: s1 = "abc", s2 = "bca"
//输出: true 
// 
//
// 示例 2： 
//
// 输入: s1 = "abc", s2 = "bad"
//输出: false
// 
//
// 说明： 
//
// 
// 0 <= len(s1) <= 100 
// 0 <= len(s2) <= 100 
// 
// Related Topics 数组 字符串 
// 👍 14 👎 0

package com.cute.leetcode.editor.cn;
public class CheckPermutationLcci {
    public static void main(String[] args) {
        Solution solution = new CheckPermutationLcci().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean CheckPermutation(String s1, String s2) {
        if(s1.length() != s2.length()){
            return false;
        }
        int a1=0;
        int a2=0;
        int b1=1;
        int b2=1;
        for (int i = 0; i < s1.length(); i++) {
            a1+=s1.charAt(i);
            a2+=s2.charAt(i);
            b1*=s1.charAt(i);
            b2*=s2.charAt(i);
        }
        if(a1==a2&&b1==b2)return true;
        return false;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}