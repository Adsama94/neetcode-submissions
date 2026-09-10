class Solution {
    fun isHappy(n: Int): Boolean {
        var slow = n
        var fast = sumOfSquares(n)

        while (slow != fast) {
            fast = sumOfSquares(fast)
            fast = sumOfSquares(fast)
            slow = sumOfSquares(slow)
        }
        return fast == 1
    }

    fun sumOfSquares(n: Int): Int {
        var output = 0
        var num = n
        while (num > 0) {
            val digit = num % 10
            output += digit * digit
            num /= 10
        }
        return output
    }
}
