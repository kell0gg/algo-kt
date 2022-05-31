package leetcode.unique_morse_codes_804

class Solution {
    companion object {
        private val MORSE = listOf(
            ".-",
            "-...",
            "-.-.",
            "-..",
            ".",
            "..-.",
            "--.",
            "....",
            "..",
            ".---",
            "-.-",
            ".-..",
            "--",
            "-.",
            "---",
            ".--.",
            "--.-",
            ".-.",
            "...",
            "-",
            "..-",
            "...-",
            ".--",
            "-..-",
            "-.--",
            "--.."
        )
    }

    fun uniqueMorseRepresentations(words: Array<String>): Int {
        val set: MutableSet<String> = HashSet()

        for (word in words) {
            val stringBuilder = StringBuilder()
            for (c in word) {
                stringBuilder.append(MORSE[c - 'a'])
            }
            set.add(stringBuilder.toString())
        }
        return set.size
    }
}