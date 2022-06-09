package leetcode.fibonacci_number_509

class Solution {
    fun fib(n: Int): Int {
        if (n <= 1) return n
        var fibo: Array<Int> = Array(n + 1) { 0 }
        fibo[0] = 0
        fibo[1] = 1
        for (i in 2..n) {
            fibo[i] = fibo[i - 1] + fibo[i - 2]
        }
        return fibo[n]
    }
}

fun main() {
    val solution = Solution()
    val result = solution.fib(4)
    println(result)
}