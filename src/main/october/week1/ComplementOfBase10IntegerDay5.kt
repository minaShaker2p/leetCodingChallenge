package main.october.week1

import kotlin.math.pow

/**
Every non-negative integer N has a binary representation.
For example, 5 can be represented as "101" in binary, 11 as "1011" in binary, and so on.  Note that except for N = 0, there are no leading zeroes in any binary representation.

The complement of a binary representation is the number in binary you get when changing every 1 to a 0 and 0 to a 1.  For example, the complement of "101" in binary is "010" in binary.

For a given number N in base-10, return the complement of it's binary representation as a base-10 integer.



Example 1:

Input: 5
Output: 2
Explanation: 5 is "101" in binary, with complement "010" in binary, which is 2 in base-10.
Example 2:

Input: 7
Output: 0
Explanation: 7 is "111" in binary, with complement "000" in binary, which is 0 in base-10.
 **/

fun bitwiseComplement(N: Int): Int {

    return N.toBinary().flip().toBase10()
}

fun Int.toBinary(): String {
    var result = ""
    var number = this
    var i = 0
    if(number ==0)
        return "0"
    while (number != 0) {
        result += (number % 2)
        number /= 2
        i++
    }
    return result.reversed()
}

fun String.flip(): String {
    var result = ""
    this.forEach {
        result += if (it == '1') '0' else '1'
    }
    return result
}
fun String.toBase10(): Int {
        var result = 0.0
        this.reversed().forEachIndexed { index, c ->
            val number = if( c =='0')  0 else   1
            result += number  * (2.0.pow(index))
        }
       return result.toInt()
}

