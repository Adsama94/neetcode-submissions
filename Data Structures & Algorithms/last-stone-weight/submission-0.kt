class Solution {
    fun lastStoneWeight(stones: IntArray): Int {
        val minHeap = PriorityQueue<Int>()
        for (stone in stones) {
            minHeap.offer(-stone)
        }

        while (minHeap.size > 1) {
            val first = minHeap.poll()
            val second = minHeap.poll()
            if (second > first) {
                minHeap.offer(first - second)
            }
        }

        minHeap.offer(0)
        return Math.abs(minHeap.peek())
    }
}
