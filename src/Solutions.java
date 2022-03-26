import java.util.ArrayList;
import java.util.List;

public class Solutions {

    /* Problem 144. Binary Tree Preorder Traversal  #Easy#
     * https://leetcode.com/problems/binary-tree-preorder-traversal/
     *  Problem description:
     *  Given the root of a binary tree, return the preorder traversal of its nodes' values.
     */
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList();
        preorder(root, res);
        return res;
    }

    public void preorder(TreeNode root, List<Integer> res) {
        if (root == null) return;
        res.add(root.val);
        preorder(root.left, res);
        preorder(root.right, res);
    }

    /* Problem 94. Binary Tree Inorder Traversal  #Easy#
     * https://leetcode.com/problems/binary-tree-inorder-traversal/
     *  Problem description:
     *  Given the root of a binary tree, return the inorder traversal of its nodes' values.
     */

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList();
        inorder(root, res);
        return res;
    }

    public void inorder(TreeNode root, List<Integer> res) {
        if (root == null) return;
        inorder(root.left, res);
        res.add(root.val);
        inorder(root.right, res);
    }

    /* Problem 145. Binary Tree Postorder Traversal   #Easy#
     * https://leetcode.com/problems/binary-tree-postorder-traversal/submissions/
     *  Problem description:
     *  Given the root of a binary tree, return the postorder traversal of its nodes' values.
     */

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList();
        postorder(root, res);
        return res;
    }

    public void postorder(TreeNode root, List<Integer> res) {
        if (root == null) return;
        postorder(root.left, res);
        postorder(root.right, res);
        res.add(root.val);
    }
}
