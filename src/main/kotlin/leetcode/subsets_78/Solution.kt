package leetcode.subsets_78

import java.util.*
import kotlin.collections.ArrayList


class Solution {
    companion object {
        var answerList: MutableList<List<Int>> = ArrayList()
    }

    fun subsets(nums: IntArray): List<List<Int>> {
        val dq: Deque<Int> = ArrayDeque()

        answerList = ArrayList()
        answerList.add(listOf())
        for (i in 1..nums.size) {
            combination(nums, nums.size, i, dq, 1)
        }

//        for (i in answerList) {
//            for (j in i) {
//                print("$j ")
//            }
//            println()
//        }

        return answerList
    }

    fun combination(nums: IntArray, n: Int, k: Int, dq: Deque<Int>, depth: Int) {
        if (dq.size == k) {
            // dq.forEach { print("$it ") }
            val tmpList: MutableList<Int> = ArrayList()
            dq.forEach { tmpList.add(it) }
            // println()
            answerList.add(tmpList)
            return
        }

        for (i in depth..n) {
            dq.addLast(nums[i - 1])
            combination(nums, n, k, dq, i + 1)
            dq.pollLast()
        }
    }
}

fun main(args: Array<String>) {
    val solution = Solution()
    solution.subsets(intArrayOf(0))
}
