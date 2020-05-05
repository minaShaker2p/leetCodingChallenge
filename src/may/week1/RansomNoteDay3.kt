package may.week1

import java.util.*

fun canConstruct(ransomNote: String, magazine: String): Boolean {
    var isConstructed = true
    val charsMap = mutableMapOf<Char, Int>()

    magazine.forEach { char ->
        if (charsMap.containsKey(char)) {
            charsMap[char] = charsMap.getValue(char) + 1
        } else {
            charsMap[char] = 1
        }
    }

    ransomNote.forEach { char ->
        if (charsMap.containsKey(char)) {
            var count = charsMap.getValue(char)
            if (count > 0) {
                charsMap[char] = --count
            } else {
                isConstructed = false
            }
        } else {
            isConstructed = false
        }
    }

    return isConstructed
}