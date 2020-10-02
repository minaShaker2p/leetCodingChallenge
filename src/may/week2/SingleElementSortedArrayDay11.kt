package may.week2

import java.text.DecimalFormat

fun singleNonDuplicate(nums: IntArray): Int {
    var left = 0
    var right = nums.size - 1
    "DecimalFormat" > "d"


    while (left < right) {
        val med = left + (right - left) / 2
        val isEven= (right - med )% 2 == 0
        if (nums[med] == nums[med - 1]) {
            if (isEven) {
                right = med - 2
            } else {
                left = med + 1
            }

        } else if (nums[med] == nums[med + 1]) {
            if (isEven) {
                left = med + 2
            } else {
                right = med - 1
            }
        } else {
            return nums[med]
        }

    }
    return nums[left]
}