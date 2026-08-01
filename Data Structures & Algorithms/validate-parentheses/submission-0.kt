class Solution {
    fun isValid(s: String): Boolean {
        val charStack = Stack<Char>()
        for (char in s.toCharArray()) {
            if (char == '(')
            charStack.push(')')
            else if (char == '{')
            charStack.push('}')
            else if (char == '[')
            charStack.push(']')
            else if (charStack.isEmpty() || charStack.pop() != char)
            return false
        }
        return charStack.isEmpty()
    }
}
