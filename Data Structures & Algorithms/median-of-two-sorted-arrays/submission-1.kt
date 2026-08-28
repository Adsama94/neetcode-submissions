class Solution {
    fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
        if (nums1.size > nums2.size) {
            return findMedianSortedArrays(nums2, nums1)
        }
        val firstSize = nums1.size
        val secondSize = nums2.size
        var left = 0
        var right = firstSize
        while (left <= right) {
            val firstPartition = (left + right) / 2
            val secondPartition = (firstSize + secondSize + 1) / 2 - firstPartition

            val maxLeft1 = if (firstPartition == 0) Int.MIN_VALUE else nums1[firstPartition - 1]
            val maxLeft2 = if (secondPartition == 0) Int.MIN_VALUE else nums2[secondPartition - 1]
            val minRight1 = if (firstPartition == firstSize) Int.MAX_VALUE else nums1[firstPartition]
            val minRight2 = if (secondPartition == secondSize) Int.MAX_VALUE else nums2[secondPartition]

            if (maxLeft1 <= minRight2 && maxLeft2 <= minRight1) {
                val medianLeft = maxOf(maxLeft1, maxLeft2).toDouble()
                val medianRight = minOf(minRight1, minRight2).toDouble()
                return if ((firstSize + secondSize) % 2 == 0) (medianLeft + medianRight) / 2 else medianLeft
            } else if (maxLeft1 > minRight2) {
                right = firstPartition - 1
            } else {
                left = firstPartition + 1
            }

        }
        return -1.0
    }
}
