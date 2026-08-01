class Solution {
    fun minEatingSpeed(piles: IntArray, h: Int): Int {
        var left = 1
        var right = piles.maxOrNull()!!

        fun canFinish(speed: Int): Boolean {
            var hours = 0L

            for (pile in piles) {
                hours += (pile + speed - 1) / speed
            }

            return hours <= h
        }

        while (left < right) {
            val mid = left + (right - left) / 2

            if (canFinish(mid)) {
                right = mid
            } else {
                left = mid + 1
            }
        }

        return left
    }
}
