package pascal_triangle_118


class Solution {
    fun generate(numRows: Int): List<List<Int>> {
        val result: MutableList<List<Int>> = ArrayList()

        for (i in 0 until numRows) {
            val row: MutableList<Int> = ArrayList()
            for (j in 0 until i + 1) {
                if (j == 0 || j == i) {
                    row.add(1)
                } else {
                    row.add(result[result.size - 1][j - 1] + result[result.size - 1][j])
                }
            }
            result.add(row)
        }
        return result
    }
}

fun main(args: Array<String>) {
    val solution = Solution()
    val result: List<List<Int>> = solution.generate(5)
    for (i in result) {
        for (j in i) {
            print("$j ")
        }
        println()
    }
}
