/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution {
    fun reverseBetween(head: ListNode?, left: Int, right: Int): ListNode? {
        if (head == null || left == right) return head

        val dummy = ListNode(0)
        dummy.next = head

        var previous: ListNode? = dummy

        for (i in 1 until left) {
            previous = previous?.next
        }

        var current = previous?.next

        for (i in 0 until (right - left)) {
            val next = current?.next
            current?.next = next?.next
            next?.next = previous?.next
            previous?.next = next
        }
        return dummy.next
    }
}
