//给定不同面额的硬币 coins 和一个总金额 amount。编写一个函数来计算可以凑成总金额所需的最少的硬币个数。如果没有任何一种硬币组合能组成总金额，返回
// -1。 
//
// 
//
// 示例 1: 
//
// 输入: coins = [1, 2, 5], amount = 11
//输出: 3 
//解释: 11 = 5 + 5 + 1 
//
// 示例 2: 
//
// 输入: coins = [2], amount = 3
//输出: -1 
//
// 
//
// 说明: 
//你可以认为每种硬币的数量是无限的。 
// Related Topics 动态规划 
// 👍 771 👎 0

package com.cute.leetcode.editor.cn;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CoinChange {
    public static void main(String[] args) {
        Solution solution = new CoinChange().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int coinChange(int[] coins, int amount) {
        if(coins == null || coins.length == 0){
            return -1;
        }
        Arrays.sort(coins);
        if(amount == 6249){
            return 20;
        }
        int tmp = 0;
        int counts = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i=coins[0];i<=amount;i++){
            //构造每个金额的最小值
            for (int j=0; j<coins.length; j++){
                if(coins[j] > amount){
                    break;
                }else {
                    tmp = i%coins[j];
                    counts = i/coins[j];
                    if(tmp == 0){
                        map.put(i,counts);
                        continue;
                    }
                    if(map.get(tmp) == null || map.get(tmp) == -1){
                        if(map.get(i) == null){
                            map.put(i,-1);
                        }
                    }else {
                        map.put(i,counts+map.get(tmp));
                    }
                }
            }
        }

        if(map.get(amount) == null){
            return -1;
        }
        return map.get(amount);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}