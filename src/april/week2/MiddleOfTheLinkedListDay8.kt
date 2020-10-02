package april.week2



fun middleNode(head: ListNode?): ListNode? {
    var current = head
    if (current?.next == null) return null

    var size = 1

    while (current?.next != null) {
        ++size
        current = current?.next
    }

    var newCurrent = head

    val middle = size / 2

    var i = 0
    while (i < middle) {
        i++
        newCurrent = newCurrent?.next

    }

    return newCurrent
}

class ListNode(var data: Int) {
    var next: ListNode? = null
}