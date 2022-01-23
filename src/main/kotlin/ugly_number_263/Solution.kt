package ugly_number_263

class Solution {
    fun isUgly(n: Int): Boolean {
        if (n <= 0) return false
        var tmpN = n
        while ((tmpN % 2) == 0) {
            tmpN /= 2
        }
        while ((tmpN % 3) == 0) {
            tmpN /= 3
        }
        while ((tmpN % 5) == 0) {
            tmpN /= 5
        }
        return tmpN == 1
    }
}

fun main(args: Array<String>) {
    val solution = Solution()
    val result = solution.isUgly(6)
    println(result)
}