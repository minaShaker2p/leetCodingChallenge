package may.week1

import javax.print.attribute.IntegerSyntax
import kotlin.math.pow

fun findComplement(num: Int): Int {
    var result = 0.0
    calculateBinaryFromNumber(num).map {
        if (it == 1)
            0
        else
            1
    }.forEachIndexed { index, i ->
            result += i * (2.toDouble().pow(index))
    }
    return  result.toInt()
}

fun calculateBinaryFromNumber(num: Int): List<Int> {
    var number = num
    val result = mutableListOf<Int>()
    while (number != 0) {
        result.add(number % 2)
        number /= 2
    }
    return result
}