/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    fun lowestCommonAncestor(root: TreeNode?, p: TreeNode?, q: TreeNode?): TreeNode? {
        var current = root
        while (current != null) {
            if (p!!.`val` > current.`val` && q!!.`val` > current.`val`) {
                current = current.right
            } else if (p!!.`val` < current.`val` && q!!.`val` < current.`val`) {
                current = current.left
            } else {
                return current
            }
        }
        return null
    }
}
