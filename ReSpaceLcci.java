//哦，不！你不小心把一个长篇文章中的空格、标点都删掉了，并且大写也弄成了小写。像句子"I reset the computer. It still didn’
//t boot!"已经变成了"iresetthecomputeritstilldidntboot"。在处理标点符号和大小写之前，你得先把它断成词语。当然了，你有一
//本厚厚的词典dictionary，不过，有些词没在词典里。假设文章用sentence表示，设计一个算法，把文章断开，要求未识别的字符最少，返回未识别的字符数。 
//
//
// 注意：本题相对原题稍作改动，只需返回未识别的字符数 
//
// 
//
// 示例： 
//
// 输入：
//dictionary = ["looked","just","like","her","brother"]
//sentence = "jesslookedjustliketimherbrother"
//输出： 7
//解释： 断句后为"jess looked just like tim her brother"，共7个未识别字符。
// 
//
// 提示： 
//
// 
// 0 <= len(sentence) <= 1000 
// dictionary中总字符数不超过 150000。 
// 你可以认为dictionary和sentence中只包含小写字母。 
// 
// Related Topics 记忆化 字符串 
// 👍 144 👎 0

package com.cute.leetcode.editor.cn;
public class ReSpaceLcci {
    public static void main(String[] args) {
        Solution solution = new ReSpaceLcci().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int respace(String[] dictionary, String sentence) {
        int length = 0;
        int index = 0;
        int counts = 0;
        for (int i=0; i<dictionary.length; i++){
            index = 0;
            counts = 0;
            while(index<sentence.length() && index != -1){
                index = sentence.indexOf(dictionary[i],index);
                if(index != -1){
                    index += dictionary[i].length();
                    counts++;
                }
            }
            length += counts * dictionary[i].length();
        }
        return sentence.length() - length;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}