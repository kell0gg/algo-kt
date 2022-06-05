package leetcode.buddy_strings_859

class Solution {
    fun buddyStrings(s: String, goal: String): Boolean {
        if(s.length != goal.length) return false

        // swap을 한 번 했을 때 s -> goal을 만들 수 있어야 함
        val set: MutableSet<Char> = HashSet()
        val diffIdx: Array<Int> = Array(3) { 0 }

        // 두 문자열이 같을 때
        if (s == goal) {
            for (c in s) {
                if(set.contains(c)) return true
                set.add(c)
            }
            return false
        }

        // 두 문자열이 다를 때
        var idx = 0
        for (i in s.indices) {
            if (s[i] != goal[i]) {
                // 다른 문자가 나오면 해당 인덱스를 저장
                diffIdx[idx++] = i
            }
            if (idx == 3) return false
        }

        return idx == 2 && s[diffIdx[0]] == goal[diffIdx[1]] && s[diffIdx[1]] == goal[diffIdx[0]]
    }
}

fun main(){
    val solution = Solution()
    val result = solution.buddyStrings("ab", "ab")
    println(result)
}