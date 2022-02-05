package third_maximum_number_414

class Solution {
    fun thirdMax(nums: IntArray): Int {
        var max1: Int? = null
        var max2: Int? = null
        var max3: Int? = null

        for (i in nums) {
            if (i.equals(max1) || i.equals(max2) || i.equals(max3)) continue

            if (max1 == null || i > max1) {
                max3 = max2
                max2 = max1
                max1 = i
            } else if (max2 == null || i > max2) {
                max3 = max2
                max2 = i
            } else if (max3 == null || i > max3) {
                max3 = i
            } else {
                // pass
            }
        }

        // println("$max1, $max2, $max3")
        return if (max3 == null) max1!! else max3
    }
}

fun main(args: Array<String>) {
    val solution = Solution()
    val result = solution.thirdMax(intArrayOf(1, 2, 2, 5, 3, 5))
    println(result)
}