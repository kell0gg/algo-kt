package leetcode.binary_watch_401

class Solution {
    fun readBinaryWatch(turnedOn: Int): List<String> {

        // hour: 512, 256, 128, 64
        // min: 32, 16, 8, 4, 2, 0 ,1

        var answer: MutableList<String> = ArrayList()

        for (i in 0 until 12) {
            for (j in 0 until 60) {
                if (Integer.bitCount(i * 64 + j) == turnedOn) {
                    answer.add(String.format("%d:%02d", i, j))
                }
            }
        }
        return answer
    }
}

fun main(args: Array<String>) {
    val solution = Solution()
    val result = solution.readBinaryWatch(3)
    for(i in result){
        println(i)
    }
}