package main.may.week1

fun firstUniqueChar(s: String): Int {
    // create map to store each character with its occurence
    val map = mutableMapOf<Char, Int>()
    // get occurrence of each character and store it in the map
    // for example {i = 2} so  character i appear twice in the string
    s.forEach { char ->
        if (map.containsKey(char))
            map[char] = map.getValue(char) + 1
        else
            map[char] = 1
    }
     // get first index of char in the s string
    map.forEach { entry ->
        if (entry.value == 1) return s.indexOfFirst { it == entry.key }
    }
    return -1
}