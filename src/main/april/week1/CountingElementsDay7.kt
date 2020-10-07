package main.april.week1

fun countElements(arr: IntArray): Int {
    var count = 0

    for (i in arr) {
        val x = i + 1
        for (j in arr) {
            if (x == j) {
                count += 1
                break
            }
        }
    }
    return count
}