package summary_ranges_228

class Solution {
    fun summaryRanges(nums: IntArray): List<String> {

        if (nums.isEmpty()) {
            return ArrayList<String>()
        }

        val list: MutableList<String> = ArrayList()

        var first: Int = 0
        var current: Int = 0
        var last: Int = 0

        var index: Int = 0

        first = nums[index++]
        last = first

        while (index < nums.size) {
            current = nums[index]

            if (current - last == 1) {
                last = current
            } else {
                if (first == last) {
                    list.add(String.format("$first"))
                } else {
                    list.add(String.format("$first->$last"))
                }
                first = current
                last = current
            }
            index++

        }

        if (first != last) {
            list.add(String.format("$first->$last"))
        } else {
            list.add(String.format("$first"))
        }

        return list
    }
}

fun main(args: Array<String>) {
    val solution = Solution()
    // solution.summaryRanges(intArrayOf(0, 2, 3, 4, 6, 8, 9))
    solution.summaryRanges(intArrayOf(0))
}