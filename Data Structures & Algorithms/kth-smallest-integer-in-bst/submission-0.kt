/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {

    private var count = 0
    private var result = 0

    fun kthSmallest(root: TreeNode?, k: Int): Int {
        count = k
        dfs(root)
        return result
    }

    private fun dfs(node: TreeNode?) {
        if (node == null) {
            return
        }

        dfs(node.left)
        if (count == 0) return

        count--
        if (count == 0) {
            result = node.`val`
            return
        }
        
        dfs(node.right)
    }
}
