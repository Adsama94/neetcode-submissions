class Solution {
    fun evalRPN(tokens: Array<String>): Int {
        val stack = IntArray(tokens.size)
        var top = 0

        for (token in tokens) {
            when (token) {
                "+" -> {
                    stack[top - 2] = stack[top - 2] + stack[top - 1]
                    top--
                }
                "-" -> {
                    stack[top - 2] = stack[top - 2] - stack[top - 1]
                    top--
                }
                "*" -> {
                    stack[top - 2] = stack[top - 2] * stack[top - 1]
                    top--
                }
                "/" -> {
                    stack[top - 2] = stack[top - 2] / stack[top - 1]
                    top--
                }
                else -> {
                    stack[top++] = token.toInt()
                }
            }
        }
        return stack[0]
    }
}
