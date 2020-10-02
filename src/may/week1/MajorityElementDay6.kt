package may.week1

fun majorityElement(numbers: IntArray): Int {
    // map which store every unique number and its occurrence
    val map = mutableMapOf<Int, Int>()

    //loop on every number and store it in the map
    numbers.forEach { number ->
        // in case of the number already on the map (that is mean it is repeated before)
        // so increase it occurrence by one
        if (map.containsKey(number)) {
            map[number] = map.getValue(number) + 1
        } else {
            // in case of it doesn't in the map (mean it is first time of occurrence )
            // so put its occurrence value to one
            map[number] = 1
        }
    }
      // finally get majority number in the map by getting key of max value in the map
    return map.maxBy { it.value }?.key ?: 0
}