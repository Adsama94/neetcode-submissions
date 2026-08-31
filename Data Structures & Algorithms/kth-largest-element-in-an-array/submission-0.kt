class Solution {
    fun findKthLargest(nums: IntArray, k: Int): Int {
        val minHeap = PriorityQueue<Int>()

        for (number in nums) {
            minHeap.offer(number)
            if (minHeap.size > k) {
                minHeap.poll()
            }
        }
        return minHeap.peek()
    }
}
