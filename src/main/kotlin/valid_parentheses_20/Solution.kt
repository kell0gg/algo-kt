package valid_parentheses_20

import java.util.*

class Solution {

    private fun initTable(mappingTable: MutableMap<Char, Char>) {
        mappingTable['('] = ')'
        mappingTable['{'] = '}'
        mappingTable['['] = ']'
    }

    fun isValid(s: String): Boolean {
        val stack = Stack<Char>()
        val mappingTable = mutableMapOf<Char, Char>()

        initTable(mappingTable)

        for (i in s) {

            when (i) {
                '(', '[', '{' -> stack.add(i)

                else -> {

                    if (stack.size > 0 && mappingTable[stack.peek()] == i) {
                        stack.pop()
                    } else {
                        return false
                    }
                }
            }
        }

        return stack.isEmpty()
    }
}

fun main(args: Array<String>) {
    val solution = Solution()
    print(solution.isValid("["))
}