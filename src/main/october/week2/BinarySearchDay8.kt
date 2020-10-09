package main.october.week2

/**
 * Given a sorted (in ascending order) integer array nums of n elements and a target value, write a function to search target in nums. If target exists, then return its index, otherwise return -1.


Example 1:

Input: nums = [-1,0,3,5,9,12], target = 9
Output: 4
Explanation: 9 exists in nums and its index is 4

Example 2:

Input: nums = [-1,0,3,5,9,12], target = 2
Output: -1
Explanation: 2 does not exist in nums so return -1
 **/

fun search(nums: IntArray, target: Int): Int {
    var low = 0
    var high = nums.size - 1

    var middle = (low + high) / 2
    while (low < high) {
        if (target <= nums[middle])
            high = middle
        else
            low = middle + 1

        middle = (low + high) / 2
    }

    return if(target==nums[middle]) return middle else -1
}