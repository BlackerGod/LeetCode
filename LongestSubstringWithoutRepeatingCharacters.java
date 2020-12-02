//给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。 
//
// 示例 1: 
//
// 输入: "abcabcbb"
//输出: 3 
//解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
// 
//
// 示例 2: 
//
// 输入: "bbbbb"
//输出: 1
//解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
// 
//
// 示例 3: 
//
// 输入: "pwwkew"
//输出: 3
//解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
//     请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
// 
// Related Topics 哈希表 双指针 字符串 Sliding Window 
// 👍 4114 👎 0

package com.cute.leetcode.editor.cn;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        Solution solution = new LongestSubstringWithoutRepeatingCharacters().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s == null || s.length() == 0){
            return 0;
        }
        if(s.length() == 1){
            return 1;
        }
//        List<Integer> tmp;
//        for (int i=0; i<s.length(); i++){
//            if(map.get(s.charAt(i)) == null){
//                tmp = new LinkedList<>();
//            }else {
//                tmp = map.get(s.charAt(i));
//            }
//            tmp.add(i);
//            map.put(s.charAt(i),tmp);
//        }
//        int result = 0;
//        for (Map.Entry<Character,List<Integer>> entry : map.entrySet()){
//            if(entry.getValue().size() == 1){
//                if(s.length() - entry.getValue().get(0) > result){
//                    result = s.length() - entry.getValue().get(0);
//                }
//            }else {
//                for (int i=1; i<entry.getValue().size(); i++){
//                    if(entry.getValue().get(i) - entry.getValue().get(i-1) > result){
//                        result = entry.getValue().get(i) - entry.getValue().get(i-1);
//                    }
//                }
//                if(s.length() - entry.getValue().get(entry.getValue().size()-1) > result){
//                    result = s.length() - entry.getValue().get(entry.getValue().size()-1);
//                }
//            }
//        }
        HashMap<Character,Integer> map;
        int result = 0;
        for (int i=0; i<s.length()-1; i++){
            int tmp = 1;
            map = new HashMap<>();
            map.put(s.charAt(i),i);
            for (int j=i+1; j<s.length(); j++){
                if(map.get(s.charAt(j)) == null){
                    tmp++;
                    map.put(s.charAt(j),j);
                }else{
                    break;
                }
            }
            if(tmp > result){
                result = tmp;
            }
        }


        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}