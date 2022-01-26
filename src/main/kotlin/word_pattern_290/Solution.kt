package word_pattern_290

class Solution {
    fun wordPattern(pattern: String, s: String): Boolean {

        val map: MutableMap<Char, String> = HashMap()
        val list: List<String> = s.split(" ")

        if (list.size != pattern.length) return false

        // 1. ""으로 초기화
        for (i in pattern) {
            map[i] = ""
        }

        // 2. 값이 ""이면 맵에 넣고, ""이 아니라면 비교
        // map[a] = "cat"

        // 3. abba, dog dog dog dog -> false

        for (i in pattern.withIndex()) {
            if (map[i.value] == "") {
                // map[a] = dog 일 때,
                // map[b] = dog 일 때 문제가 됨
                // map.containsValue() -> O(N)
                // map[b] = dog를 넣기 전에, 확인하는 로직 추가
                if (map.containsValue(list[i.index])) {
                    return false
                }
                map[i.value] = list[i.index]
            } else {
                if (map[i.value] != list[i.index]) {
                    return false
                }
            }
        }

        return true
    }
}

fun main(args: Array<String>) {
    val solution: Solution = Solution()
    val result: Boolean = solution.wordPattern("abba", "dog dog dog dog")
    println(result)
}