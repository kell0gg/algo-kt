package leetcode.roman_to_integer_13

class MapRomanToInt {
    val map: MutableMap<Char, Int> = mutableMapOf(
        'I' to 1, 'V' to 5, 'X' to 10, 'L' to 50, 'C' to 100, 'D' to 500, 'M' to 1000
    )

    companion object {
        private val map_s: MutableMap<Char, Int> = mutableMapOf(
            'I' to 1, 'V' to 5, 'X' to 10, 'L' to 50, 'C' to 100, 'D' to 500, 'M' to 1000
        )

        fun getMap(roman: Char): Int {
            return map_s[roman] ?: 0
        }
    }
}

class Solution {
    // val mapRomanToInt: MapRomanToInt = MapRomanToInt()

    fun romanToInt(s: String): Int {

        var number: Int = 0
        var last: Int = 1000

        s.forEach {
            // val value = mapRomanToInt.map[it] ?: 0
            val value = MapRomanToInt.getMap(it)
            if (value > last) number -= last * 2

            number += value
            last = value
        }

        return number
    }
}

fun main(args: Array<String>) {
    val solution = Solution();
    var value: Int = solution.romanToInt("III")
    print(value)
}