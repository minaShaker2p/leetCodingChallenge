package main.october.week2

import kotlin.math.max

/*
You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed. All houses at this place are arranged in a circle. That means the first house is the neighbor of the last one. Meanwhile, adjacent houses have a security system connected, and it will automatically contact the police if two adjacent houses were broken into on the same night.

Given a list of non-negative integers nums representing the amount of money of each house, return the maximum amount of money you can rob tonight without alerting the police.


Example 1:

Input: nums = [2,3,2]
Output: 3
Explanation: You cannot rob house 1 (money = 2) and then rob house 3 (money = 2), because they are adjacent houses.
Example 2:

Input: nums = [1,2,3,1]
Output: 4
Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3).
Total amount you can rob = 1 + 3 = 4.
Example 3:

Input: nums = [0]
Output: 0
 */


fun rob(numbers: IntArray): Int {

    if (numbers.isEmpty())
        return 0
    if (numbers.size == 1)
        return numbers[0]

    return max(robHouse1(numbers.copyOfRange(0,numbers.size-1)),robHouse1(numbers.copyOfRange(1,numbers.size)))
}

private fun robHouse1(numbers: IntArray): Int {
    if (numbers.isEmpty())
        return 0
    if (numbers.size == 1)
        return numbers[0]
    if (numbers.size == 2)
        return max(numbers[0], numbers[1])

    val d = IntArray(numbers.size)
    d[0] = numbers[0]
    d[1] = max(numbers[0], numbers[1])
    for (i in 2 until numbers.size) {
        d[i] = max(numbers[i] + d[i - 2], d[i-1])
    }
    return d[numbers.size - 1]
}