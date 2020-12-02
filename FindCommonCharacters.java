//给定仅有小写字母组成的字符串数组 A，返回列表中的每个字符串中都显示的全部字符（包括重复字符）组成的列表。例如，如果一个字符在每个字符串中出现 3 次，但不
//是 4 次，则需要在最终答案中包含该字符 3 次。 
//
// 你可以按任意顺序返回答案。 
//
// 
//
// 示例 1： 
//
// 输入：["bella","label","roller"]
//输出：["e","l","l"]
// 
//
// 示例 2： 
//
// 输入：["cool","lock","cook"]
//输出：["c","o"]
// 
//
// 
//
// 提示： 
//
// 
// 1 <= A.length <= 100 
// 1 <= A[i].length <= 100 
// A[i][j] 是小写字母 
// 
// Related Topics 数组 哈希表 
// 👍 92 👎 0

package com.cute.leetcode.editor.cn;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class FindCommonCharacters {
    public static void main(String[] args) {
        Solution solution = new FindCommonCharacters().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<String> commonChars(String[] A) {
        if(A == null || A.length == 0){
            return new LinkedList<String>();
        }
        List<String> result = new LinkedList<>();

        if(A.length == 1){
            char[] tmp =A[0].toCharArray();
            for (char c:tmp){
                result.add(String.valueOf(c));
            }
            return result;
        }

        HashMap<Character,Integer> map = new HashMap<>();
        char[] tmp =A[0].toCharArray();
        for (char c:tmp){
            if(map.get(c) != null){
                map.put(c,map.get(c)+1);
            }else {
                map.put(c,1);
            }
        }
        boolean flag = false;
        int counts = 0;
        for (Iterator<Map.Entry<Character, Integer>> it = map.entrySet().iterator(); it.hasNext();){
            flag = false;
            Map.Entry<Character, Integer> item = it.next();
            counts = item.getValue();
            for (String s : A){
                if(!s.contains(item.getKey().toString())){
                    it.remove();
                    flag = true;
                    break;
                }else {
                    counts = Math.min(counts,conutChars(s,item.getKey()));
                }
            }
            if (!flag){
                item.setValue(counts);
            }
        }

        for (Map.Entry<Character,Integer> entry : map.entrySet()){
            for (int i=entry.getValue(); i>0; i--){
                result.add(entry.getKey().toString());
            }
        }
        return result;
    }

    private int conutChars(String tmp, char c){
        int result = 0;
        for (char t : tmp.toCharArray()){
            if (t == c) result++;
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}