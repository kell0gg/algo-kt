package leetcode.first_unique_character_in_a_string_387

class Solution {
    fun firstUniqChar(s: String): Int {
        // 1. 문자가 몇 번씩 나왔는지를 확인함
        // 2. 해당 문자의 인덱스를 알아야하는데, 인덱스도 같이 저장
        // 3. Pair 왼쪽 index, 오른쪽 나온 횟수
        val map: MutableMap<Char, Pair<Int, Int>> = HashMap()

        for (i in s.withIndex()) {
            val tmp = map.getOrDefault(i.value, Pair(i.index, 0)).second + 1
            map[i.value] = Pair(i.index, tmp)
        }

        var firstIndex: Int = Int.MAX_VALUE

        for (i in map) {
            if (i.value.second == 1) {
                firstIndex = kotlin.math.min(firstIndex, i.value.first)
            }
        }

        return if (firstIndex == Int.MAX_VALUE) -1 else firstIndex
    }
}

fun main(args: Array<String>) {
    val solution = Solution()
    val result = solution.firstUniqChar("abcdea")
    print(result)
}
