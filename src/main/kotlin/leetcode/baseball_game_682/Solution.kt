package leetcode.baseball_game_682

import java.util.*

class Solution {
    companion object {
        const val DOUBLE_SCORE = "D"
        const val CANCEL_SCORE = "C"
        const val ADD_SCORE = "+"
    }

    fun calPoints(ops: Array<String>): Int {
        val scores: MutableList<Int> = ArrayList()

        for (i in ops) {
            if (i == DOUBLE_SCORE && scores.size >= 1) {
                scores.add(scores[scores.size - 1] * 2)

            } else if (i == CANCEL_SCORE && scores.size >= 1) {
                scores.removeAt(scores.size - 1)

            } else if (i == ADD_SCORE && scores.size >= 2) {
                scores.add(scores[scores.size - 1] + scores[scores.size - 2])
            } else {
                scores.add(i.toInt())
            }
        }

        return scores.sum()
    }

}

fun main(args: Array<String>) {
    val test = "-10a"
    println(test.toInt())
}