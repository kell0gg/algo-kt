package paskal_triangle_119

class Solution {
    fun getRow(rowIndex: Int): List<Int> {
        val result: MutableList<List<Int>> = ArrayList()

        for (i in 0 until rowIndex + 1) {
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

        return result[rowIndex]
    }
}

fun main(args: Array<String>) {
    val solution = Solution()
    val result: MutableList<Int> = solution.getRow(3) as MutableList<Int>

    for (i in result) {
        print("$i ")
    }


}