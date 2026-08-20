/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {

    var isBalanced = true 

    fun isBalanced(root: TreeNode?): Boolean {
        if (root == null) return true
        getHeight(root)
        return isBalanced
    }

    private fun getHeight(root: TreeNode?): Int {
        if (root == null) return 0
        val leftHeight = getHeight(root.left)
        val rightHeight = getHeight(root.right)
        val difference = Math.abs(leftHeight - rightHeight)
        if (difference > 1) isBalanced = false
        return 1 + maxOf(leftHeight, rightHeight)
    }
    
}
