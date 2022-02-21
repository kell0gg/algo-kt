package relative_ranks_506

class Solution {
    fun findRelativeRanks(score: IntArray): Array<String> {
        // 1. 상위 3개만 선택
        // 2. 상위 3개는 이름을 변경
        // 3. 나머지는 숫자를 문자열로 변경

        // Comparator -> sortWith에서 명시적으로 Comparator를 안달아주면 타입추론에 실패함(leetcode)
        val list: MutableList<Rank> = ArrayList<Rank>()
        score.forEachIndexed{ index, i -> list.add(Rank(index, i)) }
        list.sortWith (Comparator{ a, b ->
            when {
                a.score == b.score -> a.index - b.index
                else -> b.score - a.score
            }
        })

        var result: Array<String> = Array(list.size) { "" }

        result[list[0].index] = "Gold Medal"
        result[list[1].index] = "Silver Medal"
        result[list[2].index] = "Bronze Medal"


        for (i in 3 until list.size) {
            result[list[i].index] = (list[i].index + 1).toString()
        }

        return result
    }
}

class Rank(var index: Int, var score: Int)

fun main(args: Array<String>) {
    val solution = Solution()
    solution.findRelativeRanks(intArrayOf(5, 4, 3, 2, 1))
}