package main

import main.october.week1.bitwiseComplement
import kotlin.math.absoluteValue
import kotlin.math.pow

fun main(args: Array<String>) {
     println(solution(0))
     println(solution(760))
    println(solution(268))
    println(solution(-999))
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

fun solution(N: Int): Int {
    val nums = mutableListOf<Int>()
    var number = N

        if (number == 0)
            nums.add(0)
         number= number.absoluteValue

        while (number != 0) {
            val temp = number % 10
            nums.add(temp)
            number /= 10
            if (temp < 5)
                break
        }
        nums.add(5)
        if (number > 0)
            nums.add(number)


    var sum = 0
    nums.forEachIndexed { index, i ->
        sum += i * (10.0.pow(index * 1.0)).toInt()
    }
    return if(N >= 0) sum else sum*-1
}
