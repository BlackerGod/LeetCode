//配对交换。编写程序，交换某个整数的奇数位和偶数位，尽量使用较少的指令（也就是说，位0与位1交换，位2与位3交换，以此类推）。 
//
// 示例1: 
//
// 
// 输入：num = 2（或者0b10）
// 输出 1 (或者 0b01)
// 
//
// 示例2: 
//
// 
// 输入：num = 3
// 输出：3
// 
//
// 提示: 
//
// 
// num的范围在[0, 2^30 - 1]之间，不会发生整数溢出。 
// 
// Related Topics 位运算 
// 👍 24 👎 0

package com.cute.leetcode.editor.cn;
public class ExchangeLcci {
    public static void main(String[] args) {
        Solution solution = new ExchangeLcci().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int exchangeBits(int num) {
        int qi = num & 357913941;
        int ou = num & 715827882;
        qi = qi << 1;
        ou = ou >> 1;
        return qi+ou;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}