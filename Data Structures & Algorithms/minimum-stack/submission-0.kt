class MinStack() {

    private class Node(
        val value: Int,
        val currentMinimum: Int,
        val next: Node?
    )

    private var head: Node? = null

    fun push(`val`: Int) {
        if (head == null) {
            head = Node(`val`, `val`, null)
        } else {
            val newMinimum = minOf(`val`, head!!.currentMinimum)
            head = Node(`val`, newMinimum, head)
        }
    }

    fun pop() {
        head = head?.next
    }

    fun top(): Int {
        return head!!.value
    }

    fun getMin(): Int {
        return head!!.currentMinimum
    }
}
