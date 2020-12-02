//整数转换。编写一个函数，确定需要改变几个位才能将整数A转成整数B。 
//
// 示例1: 
//
// 
// 输入：A = 29 （或者0b11101）, B = 15（或者0b01111）
// 输出：2
// 
//
// 示例2: 
//
// 
// 输入：A = 1，B = 2
// 输出：2
// 
//
// 提示: 
//
// 
// A，B范围在[-2147483648, 2147483647]之间 
// 
// Related Topics 位运算 
// 👍 8 👎 0

package com.cute.leetcode.editor.cn;
public class ConvertIntegerLcci {
    public static void main(String[] args) {
        Solution solution = new ConvertIntegerLcci().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int convertInteger(int A, int B) {
        int result = 0;
        A = A^B;
        while (A != 0) {
            A &= (A - 1);  // 去掉二进制表示的最右边的1
            result++;
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}