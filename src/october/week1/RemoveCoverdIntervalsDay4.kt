package october.week1

/**
Given a list of intervals, remove all intervals that are covered by another interval in the list.

Interval [a,b) is covered by interval [c,d) if and only if c <= a and b <= d.

After doing so, return the number of remaining intervals.

 */

/**
 *
Example 1:

Input: intervals = [[1,4],[3,6],[2,8]]
Output: 2
Explanation: Interval [3,6] is covered by [2,8], therefore it is removed.
Example 2:

Input: intervals = [[1,4],[2,3]]
Output: 1
Example 3:

Input: intervals = [[0,10],[5,12]]
Output: 2
Example 4:

Input: intervals = [[3,10],[4,10],[5,11]]
Output: 2
 */

fun removeCoveredIntervals(intervals: Array<IntArray>): Int {

    // find the most largest interval
    var largestIntervalDiff = 0
    var largestInterval: IntArray = intervals[0]
    intervals.forEachIndexed { index, interval ->
        val diff = interval[1] - interval[0]
        if (diff >= largestIntervalDiff) {
            largestIntervalDiff = diff
            largestInterval = interval
        }
    }
    var result = 1
    intervals.forEach { interval ->
        if (largestInterval[0] > interval[0] || largestInterval[1] > interval[1])
            result += 1

    }
    return result
}