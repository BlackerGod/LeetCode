//数字 n 代表生成括号的对数，请你设计一个函数，用于能够生成所有可能的并且 有效的 括号组合。 
//
// 
//
// 示例： 
//
// 输入：n = 3
//输出：[
//       "((()))",
//       "(()())",
//       "(())()",
//       "()(())",
//       "()()()"
//     ]
// 
// Related Topics 字符串 回溯算法 
// 👍 1248 👎 0

package com.cute.leetcode.editor.cn;

import java.util.LinkedList;
import java.util.List;

public class GenerateParentheses {
    public static void main(String[] args) {
        Solution solution = new GenerateParentheses().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
        List<String> result = new LinkedList<>();
    public List<String> generateParenthesis(int n) {
        if(n <= 0){
            return result;
        }
        dfs(n,n,"");
        return result;
    }
    public void dfs(int left,int right,String cur){
        if(left == 0 && right == 0){
            result.add(cur);
            return;
        }
        if(left > 0){
            dfs(left-1,right,cur+"(");
        }
        if(right > left){
            dfs(left,right-1,cur+")");
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}