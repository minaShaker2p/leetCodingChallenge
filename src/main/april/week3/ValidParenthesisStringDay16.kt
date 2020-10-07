package main.april.week3

import java.util.*

fun checkValidString(s: String): Boolean {
    val openStack = Stack<Int>()
    val asteriskStack = Stack<Int>()

    if(s.isEmpty()) return true


    s.forEachIndexed { index, char ->
        when (char) {
            '(' -> openStack.push(index)
            '*' -> asteriskStack.push(index)
            else -> when {
                openStack.isNotEmpty() -> openStack.pop()
                asteriskStack.isNotEmpty() -> asteriskStack.pop()
                else -> return false
            }
        }
    }

    while (openStack.isNotEmpty()&&asteriskStack.isNotEmpty()) {
        val openPeek = openStack.peek()
        val asteriskPeek = asteriskStack.peek()
        if (asteriskPeek > openPeek) {
            openStack.pop()
            asteriskStack.pop()
        } else {
            return false
        }
    }

    return openStack.isEmpty()

}