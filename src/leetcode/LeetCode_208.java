package leetcode;

import com.sun.org.apache.bcel.internal.generic.NEW;
import tree.TreeNode;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_208 {
    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("apple");
        boolean apple = trie.search("apple");
        System.out.println(apple);

    }

    /**
     * 前缀树
     */
    static class Trie {
        //        使用数组进行模拟
        private Trie[] children; //孩子节点 用于查找
        private boolean isEnd; //判断是到达单词结尾处

        /**
         * 初始化前缀 树 单词全是英文字母构成 前缀树的子节点有26个是个多叉树
         */
        public Trie() {
//           父节点的子节点 字母位 26
            children = new Trie[26];
//            isEnd = false;
        }

        /**
         * 向树中插入Word 如果存在子节点 寻找子节点字符位是否存在 存在则不需要操作搜索下一个字符 不存在存入字符
         *
         * @param word
         */
        public void insert(String word) {
//            前缀树赋值  node用来遍历
            Trie trie = this;
            //搜索每一个字符
            for (int i = 0; i < word.length(); i++) {
                char a = word.charAt(i);
                int index = a - 'a';//index为字符位
                if (trie.children[index] == null) {
//                    插入 构建子节点
                    trie.children[index] = new Trie();
                }
//                   无论有没有都需要 指针后移 纵向搜索创建
                trie = trie.children[index];

            }
            trie.isEnd = true;
        }

        /**
         * 节点搜索 从根节点搜索前缀
         *
         * @param word
         * @return
         */
        public boolean search(String word) {
            Trie trie = this;
            for (int i = 0; i < word.length(); i++) {
                char a = word.charAt(i);
                int index = a - 'a';
                if (trie.children[index] == null) {
                    return false;
                }
                trie = trie.children[index];

            }
            return trie.isEnd;

        }

        /**
         * 搜索前缀 一直搜到了结尾 为true
         *
         * @param prefix
         * @return
         */
        public boolean startsWith(String prefix) {
            Trie trie = this;
//            boolean end = false;
            for (int i = 0; i < prefix.length(); i++) {
                char a = prefix.charAt(i);
                int index = a - 'a';
                if (trie.children[index] == null) {
//                    end = trie.children[index].isEnd;
                    return false;
                }
//                    end = trie.children[index].isEnd;
                trie = trie.children[index];

            }
            return true;
        }
    }
}
