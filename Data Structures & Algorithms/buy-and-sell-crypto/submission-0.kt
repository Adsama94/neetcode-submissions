class Solution {
    fun maxProfit(prices: IntArray): Int {
        var profit = 0
        var minPrice = Int.MAX_VALUE

        for (i in prices.indices) {
            if (prices[i] < minPrice) {
                minPrice = prices[i]
            } else if (prices[i] - minPrice > profit) {
                profit = prices[i] - minPrice
            }
        }
        return profit
    }
}
