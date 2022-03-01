package leetcode.power_of_two_231

class Solution {
    fun isPowerOfTwo(n: Int): Boolean {
        if(n<=0) return false
        if(n==1) return true

        var tmpN = n

        while (tmpN > 1) {

            if (tmpN % 2 != 0) return false
            tmpN /= 2
        }
        return true
    }
}

fun main(args: Array<String>) {
    val solution = Solution()
    val result = solution.isPowerOfTwo(5)
    println(result)
}