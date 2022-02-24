package student_attendance_record_1_551

class Solution {
    fun checkRecord(s: String): Boolean {
        /*
        The student was absent ('A') for strictly fewer than 2 days total.
        The student was never late ('L') for 3 or more consecutive days.
         */
        //
        var absentCount = 0

        for (i in s.indices) {
            if (s[i] == 'A') {
                absentCount++
                if (absentCount >= 2) return false
            } else if (s[i] == 'L') {
                if (i > 1 && s[i - 1] == 'L' && s[i-2]=='L') {
                    return false
                }
            } else {
                // pass
            }
        }
        return true
    }
}