package april.week1

fun isHappy(n: Int): Boolean {
    var number = n
    val seen = hashSetOf<Int>()
    var isHappy = false

    while (!isHappy) {
        if (number == 1)
            isHappy = true
        else {
            var sum = 0

            while (number != 0) {
                val num: Int = number % 10
                sum += (num * num)
                number /= 10
            }
            number=sum
            if (!seen.contains(sum)) seen.add(sum)
            else break
        }

    }
    return isHappy
}