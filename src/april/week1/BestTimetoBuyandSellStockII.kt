package april.week1

fun maxProfit(prices: IntArray): Int {
    if (prices.isEmpty())
        return 0

    var profit = 0
    for (i in 0 until prices.size - 1) {
        if (prices[i + 1] > prices[i]) {
            profit += prices[i + 1] - prices[i]
        }

    }
    return profit
}