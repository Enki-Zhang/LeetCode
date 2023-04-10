package tree;

import com.sun.org.apache.xerces.internal.impl.dv.xs.AnyURIDV;

import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_236 {
    public static void main(String[] args) {
    }
//    236. 二叉树的最近公共祖先

    //    class Solution {
//        ArrayList<TreeNode> list = new ArrayList<>();
//        int max;
//
//        public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//            if (root == null) {
//                return null;
//            }
//            TreeNode node;
//            parList(root, p, q);
//            Iterator<TreeNode> iterator = list.iterator();
//            node = list.get(0);
//            max = maxDeep(node);
//            while (iterator.hasNext()) {
//                TreeNode next = iterator.next();
//                node = max > maxDeep(next) ? node : next;
//            }
//            return node;
//        }
//
//        public void parList(TreeNode root, TreeNode p, TreeNode q) {
//            if (root != null) {
//                Boolean isPar = backOrder(root, p, q, false, false);
//                if (isPar) {
//                    list.add(root);
//                }
//                parList(root.left, p, q);
//                parList(root.right, p, q);
//            }
//        }
//
//        //找到祖先
//        public Boolean backOrder(TreeNode root, TreeNode p, TreeNode q, boolean f1, boolean f2) {
//            if (root != null) {
//                Boolean L = backOrder(root.left, p, q, f1, f2);
//                Boolean R = backOrder(root.right, p, q, f1, f2);
//                if (root == p) {
//                  return true;
//                }
//                if (root == q) {
//                    return true;
//                }
//              return L&&R;
//            }
//            return false;
//        }
//
//        // 找到最大深度的祖先
//        public int maxDeep(TreeNode root) {
//            if (root != null) {
//                int L = maxDeep(root.left);
//                int R = maxDeep(root.right);
//                return Math.max(L, R) + 1;
//            }
//            return 0;
//        }
//    }
    class Solution {
        public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            if (root == null) {
                return null;
            }
            if (root == q || root == p) {
                return root;
            }
            //后序遍历
            TreeNode L = lowestCommonAncestor(root.left, p, q);//向左子树搜素
            TreeNode R = lowestCommonAncestor(root.right, p, q);//向右子树搜素
            if (L == null && R == null) {
                return null;
            }
            if (L != null && R == null) {
                return L;
            } else if (L == null && R != null) {
                return R;
            } else {
                return root;
            }
        }

    }
}
