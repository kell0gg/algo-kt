package intersaction_of_two_arrays_349

class Solution {
    fun intersection(nums1: IntArray, nums2: IntArray): IntArray {
        val map: MutableMap<Int, Int> = HashMap()
        val list: MutableList<Int> = ArrayList()

        nums1.distinct().forEach { map[it] = map.getOrDefault(it, 0) + 1 }
        nums2.distinct().forEach { map[it] = map.getOrDefault(it, 0) + 1 }


        for (i in map.entries) {
            if (i.value >= 2) {
                list.add(i.key)
            }
        }

        return list.toIntArray()
    }
}