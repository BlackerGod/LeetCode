//珠玑妙算游戏（the game of master mind）的玩法如下。 
// 计算机有4个槽，每个槽放一个球，颜色可能是红色（R）、黄色（Y）、绿色（G）或蓝色（B）。例如，计算机可能有RGGB 4种（槽1为红色，槽2、3为绿色，槽
//4为蓝色）。作为用户，你试图猜出颜色组合。打个比方，你可能会猜YRGB。要是猜对某个槽的颜色，则算一次“猜中”；要是只猜对颜色但槽位猜错了，则算一次“伪猜中”。
//注意，“猜中”不能算入“伪猜中”。 
// 给定一种颜色组合solution和一个猜测guess，编写一个方法，返回猜中和伪猜中的次数answer，其中answer[0]为猜中的次数，answer[
//1]为伪猜中的次数。 
// 示例： 
// 输入： solution="RGBY",guess="GGRR"
//输出： [1,1]
//解释： 猜中1次，伪猜中1次。
// 
// 提示： 
// 
// len(solution) = len(guess) = 4 
// solution和guess仅包含"R","G","B","Y"这4种字符 
// 
// Related Topics 数组 
// 👍 12 👎 0

package com.cute.leetcode.editor.cn;

import java.util.HashMap;
import java.util.Map;

public class MasterMindLcci {
    public static void main(String[] args) {
        Solution solution = new MasterMindLcci().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] masterMind(String solution, String guess) {
        if(solution == null || guess == null){
            return null;
        }
        if(solution.length() == 0 || guess.length() == 0){
            return new int[]{0,0};
        }
        HashMap<Character,Integer> A = new HashMap<>();
        HashMap<Character,Integer> B = new HashMap<>();
        int success = 0;
        char a;
        char b;
        for (int i=0; i<solution.length(); i++){
            a = solution.charAt(i);
            b = guess.charAt(i);
            if(a == b){
                success++;
            }else {
                if(A.get(a) == null){
                    A.put(a,1);
                }else {
                    A.put(a,A.get(a)+1);
                }
                if(B.get(b) == null){
                    B.put(b,1);
                }else {
                    B.put(b,B.get(b)+1);
                }
            }
        }
        int tmp = 0;
        for (Map.Entry<Character, Integer> entry : B.entrySet()) {
            if (A.get(entry.getKey()) != null) {
                tmp += Math.min(entry.getValue(),A.get(entry.getKey()));
            }
        }
        return new int[]{success,tmp};
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}