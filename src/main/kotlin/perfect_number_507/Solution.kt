package perfect_number_507

class Solution {
    fun checkPerfectNumber(num: Int): Boolean {
        // 1. 1부터 제곱근까지 1씩 올리면서 약수를 구함
        // 2. 약수의 합이 동일한지를 확인

        var sum = 0
        for (i in 1 .. (num / 2)) {
            if (num % i == 0) {
                sum += i
            }
        }
        return sum == num
    }
}

fun main(args: Array<String>) {
    val solution = Solution()
    val result = solution.checkPerfectNumber(28)
    println(result)
}