package excel_sheet_column_title_168

//A -> 1
//B -> 2
//C -> 3
//...
//Z -> 26
//AA -> 27
//AB -> 28
//...

class Solution {
    fun convertToTitle(columnNumber: Int): String {

        var quotient: Int = columnNumber;
        val stringBuilder = StringBuilder()

        while (quotient > 0) {
            var remainder = (quotient % 26) - 1;

            if (remainder == -1) {
                remainder = 25
                quotient -= 1
            }

            stringBuilder.append('a' + remainder)
            quotient /= 26
        }

        return stringBuilder.reverse().toString().toUpperCase()
    }
}

fun main(args: Array<String>) {
    val solution = Solution()
    val result = solution.convertToTitle(28)
    println(result)
}