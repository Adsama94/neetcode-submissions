class Solution {
    fun carFleet(target: Int, position: IntArray, speed: IntArray): Int {
        val n = position.size

        val cars = Array(n) { i ->
            Pair(position[i], (target - position[i]).toDouble() / speed[i])
        }

        cars.sortByDescending { it.first }

        var fleets = 0
        var maxTime = 0.0
        for ((_, time) in cars) {
            if (time > maxTime) {
                fleets++
                maxTime = time
            }
        }
        return fleets
    }
}
