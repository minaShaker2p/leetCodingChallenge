import may.week1.*
import may.week2.singleNonDuplicate
import java.lang.StringBuilder

fun main(args: Array<String>) {
    println(singleNonDuplicate(intArrayOf(3, 3, 7, 7, 10, 11, 11)))
    println(singleNonDuplicate(intArrayOf(1, 1, 2, 3, 3, 4, 4, 8, 8)))
    "Zoo" < "ball"


}

fun deleteNth(elements: IntArray, maxOcurrences: Int): IntArray {

    val result = mutableListOf<Int>()
    val map = mutableMapOf<Int, Int>()
    if (maxOcurrences < 1 || elements.isEmpty())
        return result.toIntArray()
    elements.forEach { map[it] = 1 }
    elements.forEach { element ->
        if (!result.contains(element)) {
            result.add(element)
        } else if (result.contains(element) && map.getValue(element) < maxOcurrences) {
            map[element] = map.getValue(element).inc()
            result.add(element)
        }
    }
    return result.toIntArray()
}

fun longestConsec(strarr: Array<String>, k: Int): String {
    // your code
    if (strarr.isEmpty() || k > strarr.size || k <= 0)
        return ""
    val result = mutableListOf<String>()
    strarr.forEachIndexed { index, s ->
        var currentIndex = index
        val builder = StringBuilder()
        var i = 0
        while (i < k && currentIndex < strarr.size) {
            builder.append(strarr[currentIndex++])
            i++
        }
        result.add(builder.toString())
    }

    var max = result[result.size - 1]

    for (str in result.size - 2 downTo 0) {
        if (result[str].length >= max.length) {
            max = result[str]
        }
    }



    return max
}
