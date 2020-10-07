package main.april.week2

import java.util.*


class MinStack() {

    /** initialize your data structure here. */

    private val array = mutableListOf<Int>()
    private var peek = -1


    fun push(x: Int) {
        array.add(++peek, x)
    }

    fun pop() {
        if (array.isNotEmpty()) {
            array.removeAt(peek)
            peek--
        }
    }

    fun top(): Int {
        return array[peek]
    }

    fun getMin(): Int {
        var min = array.getOrNull(0) ?: 0
        array.forEach { value ->
            if (value < min)
                min = value
        }
        return min
    }

}


class MinStackV2() {
    private val stack = LinkedList<Int>()
    private val mins = LinkedList<Int>()

    fun push(x: Int) {
        if (mins.isEmpty() || x < mins.peekLast()) {
            mins.add(x)
        }
        stack.add(x)
    }

    fun pop(): Int? {
        if (stack.isEmpty())
            return null
        val x = stack.removeLast()
        if (x == mins.peekLast()) {
            mins.removeLast()
        }
        return x
    }

    fun top(): Int? {
        if (stack.isEmpty())
            return null
        return stack.peekLast()
    }

    fun getMin(): Int? {
        if (mins.isEmpty())
            return null
        return mins.peekLast()
    }
}