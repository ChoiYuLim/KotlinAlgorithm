fun main() {
    val input = readln()
    val y = input[0].code - 96
    val x = input[1].toString().toInt()

    val dirX = listOf(1, -1, 1, -1, 2, 2, -2, -2)
    val dirY = listOf(-2, -2, 2, 2, -1, 1, -1, 1)

    var cnt = 0
    for (i in 0..7) {
        if (sol(x + dirX[i], y + dirY[i])) cnt += 1
    }
    print(cnt)
}

fun sol(x: Int, y: Int) = x in (1..8) && y in (1..8)