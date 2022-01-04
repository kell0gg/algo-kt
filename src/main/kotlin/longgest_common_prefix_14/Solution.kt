package longgest_common_prefix_14


class Solution {
    // https://stackoverflow.com/questions/55449443/using-comparator-in-kotlin
    // if else if else ... was replaced by a single Kotlin when in order make the code better readable.
    fun longestCommonPrefix(strs: Array<String>): String {

        val stringBuilder = StringBuilder()

        val customComparator = Comparator<String> { a, b ->
            a.compareTo(b)
        }


        strs.sortWith(customComparator)

        val (first, last) = strs.first() to strs.last()

        for (i in first.indices) {
            if (first[i] == last[i]) {
                stringBuilder.append(first[i])
            } else {
                return stringBuilder.toString()
            }
        }

        return stringBuilder.toString()
    }
}

fun main(args: Array<String>) {
    val solution = Solution();

    val strs: Array<String> = arrayOf("abc", "abd", "abe")

    val result = solution.longestCommonPrefix(strs)

    print(result)
}