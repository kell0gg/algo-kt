package linked_list_cycle_141

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

class Solution {
    fun hasCycle(head: ListNode?): Boolean {
        if(head == null) return false

        var slower = head
        var faster = head

        while (faster != null && faster.next != null) {
            slower = slower!!.next
            faster = faster.next!!.next

            if (slower == faster) {
                return true
            }
        }

        return false
    }
}