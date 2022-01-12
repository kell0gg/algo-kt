package best_time_to_buy_and_sell_stock_121

class Solution {
    fun maxProfit(prices: IntArray): Int {

        var max: Int = 0
        var min: Int = Int.MAX_VALUE
        for (i in prices.indices) {
            min = kotlin.math.min(min, prices[i])
            max = kotlin.math.max(max, prices[i] - min)
        }

        return max

        // O(n^2) -> Time Limit Exceeded
//        var buy: Int = 0
//        var max: Int = 0
//        for (i in prices.indices) {
//            buy = prices[i]
//            for (j in (i + 1) until prices.size) {
//                max = kotlin.math.max(max, prices[j] - buy)
//            }
//        }
//        return max
    }
}

fun main(args: Array<String>) {
    val solution = Solution()
    solution.maxProfit(intArrayOf(1, 2, 3, 4))
}