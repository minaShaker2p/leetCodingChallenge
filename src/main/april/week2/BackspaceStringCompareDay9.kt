package main.april.week2

import java.util.*

fun backspaceCompare(S: String, T: String): Boolean {

    val stack1 = Stack<Char>()
    val stack2 = Stack<Char>()

    S.forEach { char ->
        if (char != '#') {
            stack1.push(char)
        } else {
            if (stack1.size > 0)
                stack1.pop()
        }
    }

    T.forEach { char ->

        if (char != '#') {
            stack2.push(char)
        } else {
            if (stack2.size > 0)
                stack2.pop()
        }

    }
    return stack1 == stack2
}