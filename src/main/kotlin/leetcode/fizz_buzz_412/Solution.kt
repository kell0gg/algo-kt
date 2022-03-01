package leetcode.fizz_buzz_412

class Solution {
    fun fizzBuzz(n: Int): List<String> {
        val answer: MutableList<String> = ArrayList()

        for (i in 1..n) {
            if (i % 15 == 0) answer.add("FizzBuzz")
            else if (i % 3 == 0) answer.add("Fizz")
            else if (i % 5 == 0) answer.add("Buzz")
            else {
                answer.add(i.toString())
            }
        }
        return answer
    }
}

fun main(args: Array<String>) {
    val solution = Solution()
    val result = solution.fizzBuzz(15)
    result.forEach { println(it) }
}