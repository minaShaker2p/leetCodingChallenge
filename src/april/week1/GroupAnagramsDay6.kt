package april.week1

fun groupAnagrams(strs: Array<String>): List<List<String>> {
    val result = mutableListOf<List<String>>()

    val map = HashMap<String, MutableList<String>>()
    strs.forEach { str ->
        val key = str.toCharArray().sorted().joinToString("")
        if (!map.containsKey(key)) {
            map[key] = mutableListOf()
        }
        map.getValue(key).add(str)

    }
    result.addAll(map.values)
    return result
}

private fun calculateStringValue(str: String): Int {
    var sum = 0
    str.forEach {
        sum += it.toInt()
    }
    return sum
}

fun String.isAnagram(str: String): Boolean {

    if (this.length != this.length)
        return false
    this.forEach {
        if (!str.contains(it))
            return false
    }
    return true


}