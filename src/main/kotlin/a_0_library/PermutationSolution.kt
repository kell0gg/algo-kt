package a_0_library

import java.util.*

class PermutationSolution {
    fun subsets(nums: IntArray): List<List<Int>> {
        val list: MutableList<Int> = ArrayList()
        val dq: Deque<Int> = ArrayDeque()

        nums.forEach { list.add(it) }

        permutation(dq, list)
        return listOf()
    }

    fun permutation(dq: Deque<Int>, list: MutableList<Int>) {
        if (list.size == 0) {
            dq.forEach { print("$it ") }
            println()
            return
        }

        for (i in 0 until list.size) {
            dq.addLast(list.removeAt(i))
            permutation(dq, list)
            list.add(i, dq.pollLast())
        }
    }
}

fun main(args: Array<String>) {
    val solution = PermutationSolution()
    solution.subsets(intArrayOf(1, 2, 3))
}