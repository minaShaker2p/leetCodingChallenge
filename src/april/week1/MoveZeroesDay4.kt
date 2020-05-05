package april.week1

fun moveZeroes(nums: IntArray): Unit {
    var startNeedle = 0
    var endNeedle = nums.size - 1
    while (endNeedle > 0 && nums[endNeedle] == 0) {
        --endNeedle
    }


    while (startNeedle != endNeedle) {

        if (nums[startNeedle] == 0) {
            for (i in startNeedle until endNeedle) {
                // swap and move zero at the end
                var index = i
                val temp = nums[index]
                nums[index] = nums[++index]
                nums[index] = temp
            }
            // update end pointer
            --endNeedle
        } else {
            // in case start value not equal Zero just update start index
            ++startNeedle
        }
    }
}
