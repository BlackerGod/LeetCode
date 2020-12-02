//给定 n 个非负整数表示每个宽度为 1 的柱子的高度图，计算按此排列的柱子，下雨之后能接多少雨水。 
//
// 
//
// 上面是由数组 [0,1,0,2,1,0,1,3,2,1,2,1] 表示的高度图，在这种情况下，可以接 6 个单位的雨水（蓝色部分表示雨水）。 感谢 Mar
//cos 贡献此图。 
//
// 示例: 
//
// 输入: [0,1,0,2,1,0,1,3,2,1,2,1]
//输出: 6 
// Related Topics 栈 数组 双指针 
// 👍 1561 👎 0

package com.cute.leetcode.editor.cn;

import java.util.Stack;

public class TrappingRainWater {
    public static void main(String[] args) {
        Solution solution = new TrappingRainWater().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
        /*
       算法思想：维护一个单调递减（相等也可以）的栈
       1.当前高度小于等于栈顶高度，入栈，继续遍历
       2.当前高度大于栈顶高度，出栈，计算出当前墙和栈顶的墙之间水的多少；
             计算当前的高度和新栈的顶高度，重复（即继续满足单调递减栈特性）
         */
    public int trap(int[] list) {
        if(list == null || list.length <= 1){
            return 0;
        }
        Stack<Integer> stack = new Stack<>();
        int result = 0;
        for (int i=0; i<list.length; i++){
            while (!stack.isEmpty() && list[stack.peek()] < list[i]){ //当前墙高度大于栈顶高度
                int cur = stack.pop(); // 出栈
                while (!stack.isEmpty() && list[cur] == list[stack.peek()]){//剔除高度相等的情况
                    stack.pop();
                }
                if(!stack.isEmpty()){
                    int left = stack.peek();
                    result += (Math.min(list[left],list[i])-list[cur])*(i-left-1); // 计算面积
                }
            }
            stack.push(i);//当前墙放入
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}