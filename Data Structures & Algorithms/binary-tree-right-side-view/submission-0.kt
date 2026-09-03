/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    fun rightSideView(root: TreeNode?): List<Int> {
        if (root == null) return emptyList()

        val result = mutableListOf<Int>()
        val queue = ArrayDeque(listOf(root))

        while (queue.isNotEmpty()) {
            var rightSide: TreeNode? = null
            var queueLength = queue.size
            
            while (queueLength > 0) {
                val node = queue.removeFirst()
                if (node != null) {
                    rightSide = node
                    node.left?.let { queue.add(it) }
                    node.right?.let { queue.add(it) }
                }
                queueLength--
            }
            rightSide?.let { result.add(it.`val`) }
        }
        return result
    }
}
