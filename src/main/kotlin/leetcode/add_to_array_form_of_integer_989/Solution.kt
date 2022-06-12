package leetcode.add_to_array_form_of_integer_989

class Solution {
    fun addToArrayForm(num: IntArray, k: Int): List<Int> {

        val answer = ArrayList<Int>()
        var carry = 0
        var idx = num.size - 1
        var tmpK = k
        while (idx >= 0 || tmpK != 0 || carry == 1) {
            var sum = carry
            if (idx >= 0) {
                sum += num[idx--];
            }
            if (k != 0) {
                sum += (tmpK % 10)
                tmpK /= 10
            }
            // 맨 앞에다가 넣기
            answer.add(0, sum % 10)
            carry = sum / 10
        }
        return answer
    }
}

fun main() {
    val solution = Solution()
    val result = solution.addToArrayForm(intArrayOf(1, 2, 9, 9), 99)
    println(result)
}