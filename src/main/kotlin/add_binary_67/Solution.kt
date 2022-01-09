package add_binary_67

class Solution {
    fun addBinary(a: String, b: String): String {

        // number format exception
        // return (a.toLong(2)+b.toLong(2)).toString(2)

        val stringBuilder: StringBuilder = StringBuilder()
        var aPointer: Int = a.length - 1
        var bPointer: Int = b.length - 1
        var carry: Int = 0
        var sum: Int = 0

        while (aPointer >= 0 || bPointer >= 0) {
            sum = carry

            if (aPointer >= 0) {
                sum += a[aPointer--] - '0'
            }
            if (bPointer >= 0) {
                sum += b[bPointer--] - '0'
            }

            stringBuilder.append(sum % 2)
            carry = sum / 2
        }

        if(carry!=0) stringBuilder.append(carry)

        return stringBuilder.reverse().toString()
    }
}

fun main(args: Array<String>) {
    val solution = Solution()
    val result: String = solution.addBinary("111", "1")
    println(result)
}