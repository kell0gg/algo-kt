package leetcode.ransom_note_383

class Solution {
    fun canConstruct(ransomNote: String, magazine: String): Boolean {
        // hash 쓰는게 더 빠를듯...
        // sort써서 비교, O(n*logn * 2 + n) = O(n*logn)
        if(magazine.length < ransomNote.length) return false

        var r: CharArray = ransomNote.toCharArray().sortedArray()
        var m: CharArray = magazine.toCharArray().sortedArray()

        var idx1 = 0
        var idx2 = 0

        while (idx1 < r.size && idx2 < m.size) {
            if (r[idx1] != m[idx2]) {
                idx2++
            }
            else{
                idx1++
                idx2++
            }
        }
        return idx1 == r.size
    }
}

fun main(args: Array<String>) {
    val solution = Solution()
    val result = solution.canConstruct("bg", "efjbdfbdgfjhhaiigfhbaejahgfbbgbjagbddfgdiaigdadhcfcj")
    println(result)
}