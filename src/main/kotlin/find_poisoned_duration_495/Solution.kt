package find_poisoned_duration_495

class Solution {
    fun findPoisonedDuration(timeSeries: IntArray, duration: Int): Int {

        var sum = 0
        var start = timeSeries[0]
        var end = timeSeries[0] + duration

        for (i in 1 until timeSeries.size) {
            if (timeSeries[i] > end) {
                // 독 데미지 끝나기 전에 또 들어오면, 데미지 계산하고 업데이트
                sum += end - start
                start = timeSeries[i]
            }
            end = timeSeries[i] + duration
        }
        sum += end - start

        return sum
    }
}

fun main(args: Array<String>) {
    val solution = Solution()
    val result = solution.findPoisonedDuration(intArrayOf(1, 2, 3, 4, 5), 5)
    println(result)
}

