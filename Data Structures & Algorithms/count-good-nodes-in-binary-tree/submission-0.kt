/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    fun goodNodes(root: TreeNode?): Int {
        if (root == null) return 0

        fun dfs(node: TreeNode?, maxValue: Int): Int {
            if (node == null) return 0

            var result = 0
            if (node.`val` >= maxValue) {
                result = 1
            }

            val newMaxValue = maxOf(maxValue, node.`val`)
            result += dfs(node.left, newMaxValue)
            result += dfs(node.right, newMaxValue)

            return result
        }
        return dfs(root, root.`val`)
    }
}
