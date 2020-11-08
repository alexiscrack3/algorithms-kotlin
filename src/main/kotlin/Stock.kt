class Stock {

    fun maxProfit(price: Array<Int>, start: Int, end: Int): Int {
        if (end <= start) {
            return 0
        }

        var profit = 0

        // The day at which the stock must be bought
        for (i in start until end) {

            // The day at which the stock must be sold
            for (j in i + 1..end) {

                // If buying the stock at ith day and
                // selling it at jth day is profitable
                val newPrice = price[j]
                val oldPrice = price[i]
                if (newPrice > oldPrice) {

                    // Update the current profit
                    val previousMaxProfit = maxProfit(price, start, i - 1)
                    val nextMaxProfit = maxProfit(price, j + 1, end)
                    val currentProfit = (newPrice - oldPrice + previousMaxProfit + nextMaxProfit)

                    // Update the maximum profit so far
                    profit = Math.max(profit, currentProfit)
                }
            }
        }
        return profit
    }
}
