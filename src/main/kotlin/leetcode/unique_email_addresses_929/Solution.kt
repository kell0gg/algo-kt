package leetcode.unique_email_addresses_929

class Solution {
    fun numUniqueEmails(emails: Array<String>): Int {
        // 1. local name, domain name 쪼개기
        // 2. '.', '+' 처리

        val uniqueEmails: MutableSet<String> = HashSet()

        for (email in emails) {
            val name = email.split("@")
            var uniqueId = makeUniqueId(name[0]).plus("@").plus(name[1])
            uniqueEmails.add(uniqueId)
        }
        return uniqueEmails.size
    }

    private fun makeUniqueId(localName: String): String {
        val stringBuilder = StringBuilder()
        var firstPlusSignflag = false
        for (c in localName) {
            if (firstPlusSignflag) continue
            if (c in 'a'..'z') {
                stringBuilder.append(c)
            } else if (c == '.') {
                // ignore
            } else if (c == '+') {
                firstPlusSignflag = true
            } else {
                // throw exception
            }
        }
        return stringBuilder.toString()
    }
}

fun main(){
    val solution = Solution()
    val result = solution.numUniqueEmails(arrayOf("test.email+alex@leetcode.com","test.email.leet+alex@code.com"))
    println(result)
}