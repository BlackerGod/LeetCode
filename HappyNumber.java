//编写一个算法来判断一个数 n 是不是快乐数。 
//
// 「快乐数」定义为：对于一个正整数，每一次将该数替换为它每个位置上的数字的平方和，然后重复这个过程直到这个数变为 1，也可能是 无限循环 但始终变不到 1。
//如果 可以变为 1，那么这个数就是快乐数。 
//
// 如果 n 是快乐数就返回 True ；不是，则返回 False 。 
//
// 
//
// 示例： 
//
// 输入：19
//输出：true
//解释：
//1^2 + 9^2 = 82
//8^2 + 2^2 = 68
//6^2 + 8^2 = 100
//1^2 + 0^2 + 0^2 = 1
// 
// Related Topics 哈希表 数学 
// 👍 416 👎 0

package com.cute.leetcode.editor.cn;

import java.util.HashMap;
import java.util.HashSet;

public class HappyNumber {
    public static void main(String[] args) {
        Solution solution = new HappyNumber().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isHappy(int n) {
        HashSet<Long> set = new HashSet<>();
        Long beforeSum = (long)n;
        while (true){
            Long curSum = 0L;
            for (;beforeSum > 0; beforeSum/=10){
                curSum += (long)(Math.pow(beforeSum%10,2));
            }
            if(curSum == 1){
                return true;
            }
            if(set.contains(curSum)){
                break;
            }
            beforeSum = curSum;
            set.add(curSum);
        }
        return false;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}