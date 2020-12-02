//有 N 个花园，按从 1 到 N 标记。在每个花园中，你打算种下四种花之一。 
//
// paths[i] = [x, y] 描述了花园 x 到花园 y 的双向路径。 
//
// 另外，没有花园有 3 条以上的路径可以进入或者离开。 
//
// 你需要为每个花园选择一种花，使得通过路径相连的任何两个花园中的花的种类互不相同。 
//
// 以数组形式返回选择的方案作为答案 answer，其中 answer[i] 为在第 (i+1) 个花园中种植的花的种类。花的种类用 1, 2, 3, 4 表
//示。保证存在答案。 
//
// 
//
// 示例 1： 
//
// 输入：N = 3, paths = [[1,2],[2,3],[3,1]]
//输出：[1,2,3]
// 
//
// 示例 2： 
//
// 输入：N = 4, paths = [[1,2],[3,4]]
//输出：[1,2,1,2]
// 
//
// 示例 3： 
//
// 输入：N = 4, paths = [[1,2],[2,3],[3,4],[4,1],[1,3],[2,4]]
//输出：[1,2,3,4]
// 
//
// 
//
// 提示： 
//
// 
// 1 <= N <= 10000 
// 0 <= paths.size <= 20000 
// 不存在花园有 4 条或者更多路径可以进入或离开。 
// 保证存在答案。 
// 
// Related Topics 图 
// 👍 62 👎 0

package com.cute.leetcode.editor.cn;

import java.util.LinkedList;

public class FlowerPlantingWithNoAdjacent {
    public static void main(String[] args) {
        Solution solution = new FlowerPlantingWithNoAdjacent().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] gardenNoAdj(int N, int[][] paths) {
        if(N <= 0){
            return new int[0];
        }
        int[] result = new int[N];
        LinkedList<Integer>[] map = (LinkedList<Integer>[])new LinkedList[N+1];
        for (int i=1; i<map.length; i++){
            map[i] = new LinkedList<>();
        }
        for (int[] tmp : paths){
            map[tmp[0]].add(tmp[1]);
            map[tmp[1]].add(tmp[0]);
        }
        for (int i=1; i<=N; i++){
            boolean[] colors = new boolean[5];
            for (int index:map[i]){
                colors[result[index-1]] = true;
            }
            for (int j=1; j<=4; j++){
                if(!colors[j]){
                    result[i-1] = j;
                    break;
                }
            }
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}