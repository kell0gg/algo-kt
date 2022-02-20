package keyboard_row_500


//the first row consists of the characters "qwertyuiop",
//the second row consists of the characters "asdfghjkl", and
//the third row consists of the characters "zxcvbnm".

class Solution {
    companion object {
        private val FIRST_ROW: MutableSet<Char> = HashSet()
        private val SECOND_ROW: MutableSet<Char> = HashSet()
        private val THIRD_ROW: MutableSet<Char> = HashSet()
    }

    fun findWords(words: Array<String>): Array<String> {
        // return Stream.of(words).filter(s -> s.toLowerCase().matches("[qwertyuiop]*|[asdfghjkl]*|[zxcvbnm]*")).toArray(String[]::new);
        initKeyboardRow()

        return words.filter { checkConsistOfFirstRow(it) }.toTypedArray()
    }

    private fun checkConsistOfFirstRow(str: String): Boolean {
        val tmpStr = str.toLowerCase()
        var validFirst: Boolean = true
        var validSecond: Boolean = true
        var validThird: Boolean = true

        for (i in tmpStr.indices) {
            if (!FIRST_ROW.contains(tmpStr[i])) {
                validFirst = false
                break
            }
        }
        for (i in tmpStr.indices) {
            if (!SECOND_ROW.contains(tmpStr[i])) {
                validSecond = false
                break
            }
        }
        for (i in tmpStr.indices) {
            if (!THIRD_ROW.contains(tmpStr[i])) {
                validThird = false
                break
            }
        }

        return (validFirst || validSecond || validThird)
    }

    private fun initKeyboardRow() {
        val first = "qwertyuiop"
        val second = "asdfghjkl"
        val third = "zxcvbnm"
        first.forEach { FIRST_ROW.add(it) }
        second.forEach { SECOND_ROW.add(it) }
        third.forEach { THIRD_ROW.add(it) }
    }
}

fun main(args: Array<String>) {
    val solution = Solution()
    val result = solution.findWords(arrayOf("Hello","Alaska","Dad","Peace"))
    result.forEach { println(it) }
}