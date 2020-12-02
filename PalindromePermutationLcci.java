//给定一个字符串，编写一个函数判定其是否为某个回文串的排列之一。 
//
// 回文串是指正反两个方向都一样的单词或短语。排列是指字母的重新排列。 
//
// 回文串不一定是字典当中的单词。 
//
// 
//
// 示例1： 
//
// 输入："tactcoa"
//输出：true（排列有"tacocat"、"atcocta"，等等）
// 
//
// 
// Related Topics 哈希表 字符串 
// 👍 31 👎 0

package com.cute.leetcode.editor.cn;

import java.util.HashMap;
import java.util.Map;

public class PalindromePermutationLcci {
    public static void main(String[] args) {
        Solution solution = new PalindromePermutationLcci().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean canPermutePalindrome(String s) {
        if(s == null || s.length() <= 1){
            return true;
        }
        HashMap<Character,Integer> map = new HashMap<>();
        char c = ' ';
        for (int i=0; i<s.length(); i++){
            c = s.charAt(i);
            if(map.get(c) == null){
                map.put(c,1);
            }else {
                map.put(c,map.get(c)+1);
            }
        }
        int count = 0;
        for (Map.Entry<Character,Integer> entry : map.entrySet()){
            if(entry.getValue()%2 != 0){
                count++;
                if(count > 1){
                    return false;
                }
            }
        }

        return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}