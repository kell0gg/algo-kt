package leetcode.reorder_data_in_log_files_937

class Solution {
    fun reorderLogFiles(logs: Array<String>): Array<String> {
        val letterLog: MutableList<Log> = mutableListOf()
        val digitLog = mutableListOf<String>()

        logs.forEach {
            val tmp = it.split(" ")
            val identifier = tmp[0]

            // abc 123
            // 01234
            val content = it.substring(identifier.length + 1)

            if (tmp[1].toDoubleOrNull() == null) {
                letterLog.add(Log(identifier, content, it))
            } else {
                digitLog.add(it)
            }
        }

        letterLog.sortWith(Comparator { a, b ->
            if (a.content == (b.content)) {
                a.identifier.compareTo(b.identifier)
            } else {
                a.content.compareTo(b.content)
            }
        })

        /*
        // leet code 에서 아래처럼 하면 type 추론을 못함, version 이슈인듯
                letterLog.sortWith { a: Log, b: Log ->
            if (a.content == (b.content)) {
                a.identifier.compareTo(b.identifier)
            } else {
                a.content.compareTo(b.content)
            }
        }
         */


        val result = mutableListOf<String>()
        letterLog.forEach {
            result.add(it.log)
        }
        result.addAll(digitLog)

        return result.toTypedArray()
    }
}

data class Log(val identifier: String, val content: String, val log: String)

fun main() {
    val solution = Solution()
}