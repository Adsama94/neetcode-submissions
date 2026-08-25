/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    fun hasPathSum(root: TreeNode?, targetSum: Int): Boolean {
        if (root == null) return false

        val remaining = targetSum - root.`val`
        return hasPathSum(root.left, remaining) || hasPathSum(root.right, remaining) || 
        (remaining == 0 && root.left == null && root.right == null)
    }
}
