fun main() {
    var change = readln().toInt()
    var count = 0
    val coins = intArrayOf(500, 100, 50, 10)

    for (i in coins) {
        count += change / i
        change %= i
    }

    println(count)
}