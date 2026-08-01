class Solution {

    fun calPoints(operations: Array<String>): Int {
        val stack = mutableListOf<Int>()
        for (operation in operations) {
            when (operation) {
                "+" -> {
                    val top = stack.removeLast()
                    val newTop = top + stack.last()
                    stack.add(top)
                    stack.add(newTop)
                }
                "C" -> stack.removeLast()
                "D" -> stack.add(2 * stack.last())
                else -> stack.add(operation.toInt())
            }
        }
        return stack.sum()
    }

}