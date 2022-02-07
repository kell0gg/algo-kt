package number_of_segments_in_a_string_434

class Solution {
    fun countSegments(s: String): Int {
        if(s.isNullOrBlank()) return 0
        return s.split(" ", ignoreCase = true, limit = 0).filter { !it.isNullOrBlank() }.size
    }
}

fun main(args: Array<String>) {
    val solution = Solution()
    val result = solution.countSegments("Of all the gin joints in all the towns in all the world,   ")
    println(result)
}