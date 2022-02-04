package is_subsequence_392

class Solution {
    fun isSubsequence(s: String, t: String): Boolean {
        var idxs = 0
        var idxt = 0

        while (idxt < t.length && idxs < s.length) {
            if (s[idxs] == t[idxt]) {
                idxs++
                idxt++
            } else idxt++
        }
        return idxs == s.length
    }
}