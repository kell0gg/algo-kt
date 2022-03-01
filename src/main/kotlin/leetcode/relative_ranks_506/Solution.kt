package leetcode.relative_ranks_506

class Solution {
    fun findRelativeRanks(score: IntArray): Array<String> {
        // 1. 역순으로 정렬
        // 2. 10, 3, 9, 8, 4 -> 10, 9, 8, 4, 3
        // 3. (10,0), (9,2), (8,3), (4,4), (3,1)
        // 4. var[0] = 1등, var[2] = 2등, var[3] = 3등, var[4] = 4등, var[1] = 5등

        // Comparator -> sortWith에서 명시적으로 Comparator를 안달아주면 타입추론에 실패함

        val list: MutableList<Rank> = ArrayList<Rank>()
        score.forEachIndexed { index, i -> list.add(Rank(index, i)) }
        list.sortWith(Comparator { a, b ->
            when {
                a.score == b.score -> a.index - b.index
                else -> b.score - a.score
            }
        })

        var result: Array<String> = Array(list.size) { "" }

        for (i in list.withIndex()) {
            result[i.value.index] = (i.index + 1).toString()
        }

        for (i in 0 until kotlin.math.min(3,result.size)) {
            if (i == 0) {
                result[list[i].index] = "Gold Medal"
            }
            if (i == 1) {
                result[list[i].index] = "Silver Medal"
            }
            if (i == 2) {
                result[list[i].index] = "Bronze Medal"
            }
        }

        return result
    }
}

class Rank(var index: Int, var score: Int)

fun main(args: Array<String>) {
    val solution = Solution()
    val result = solution.findRelativeRanks(intArrayOf(10, 3, 8, 9, 4))
    for (i in result) {
        println(i)
    }
}