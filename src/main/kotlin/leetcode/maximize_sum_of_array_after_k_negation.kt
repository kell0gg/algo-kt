import java.util.*

fun main() {
    val solution = Solution()
    val result = solution.largestSumAfterKNegations(intArrayOf(-8, 3, -5, -3, -5, -2), 6)

    /*

    -8,3,-5,-3,-5,-2
    -8, -5, -5, -3, -2, 3

    6
     */
    println(result)
}

class Solution {
    fun largestSumAfterKNegations(nums: IntArray, k: Int): Int {
        val priorityQueue = PriorityQueue<Int>(Comparator { a, b -> (a - b) })
        var count = k
        var sum = 0
        nums.forEach {
            priorityQueue.add(it)
        }
        while (count > 0) {
            priorityQueue.add(priorityQueue.poll() * -1)
            count--
        }
        while (!priorityQueue.isEmpty()) {
            sum += priorityQueue.poll()
        }
        return sum
    }
}
