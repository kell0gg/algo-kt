package construct_the_rectangle_492

class Solution {
    fun constructRectangle(area: Int): IntArray {
        var x = kotlin.math.sqrt(area.toDouble()).toInt()
        if (x == 0) return intArrayOf(0, 0)
        while (area % x != 0) {
            x--
        }
        val y = area / x
        return intArrayOf(y, x)
    }
}

fun main(args: Array<String>) {
    val solution = Solution()
    solution.constructRectangle(4)
}