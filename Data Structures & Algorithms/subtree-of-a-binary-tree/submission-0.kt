/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    fun isSubtree(root: TreeNode?, subRoot: TreeNode?): Boolean {
        return isActualSubTree(root, subRoot, true)
    }

    fun isActualSubTree(root: TreeNode?, subRoot: TreeNode?, isRoot: Boolean): Boolean {
        if (root == null || subRoot == null) {
            return root == subRoot
        }
        
        if (root.`val` == subRoot.`val` && isActualSubTree(root.left, subRoot.left, false) && isActualSubTree(root.right, subRoot.right, false)) {
            return true
        }

        return isRoot && (isActualSubTree(root.left, subRoot, isRoot) || isActualSubTree(root.right, subRoot, isRoot))
    }
}
