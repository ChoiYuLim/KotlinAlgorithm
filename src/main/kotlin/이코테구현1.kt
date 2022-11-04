fun main() {
    val n = readln().toInt()
    val direction = readln().split(" ")
    val dirCoordinate = listOf(Coordinate(0, -1), Coordinate(0, 1), Coordinate(-1, 0), Coordinate(1, 0))
    val moveList = listOf("L", "R","U","D")
    var cx = 1
    var cy = 1
    var nx = 1
    var ny = 1

    direction.forEach {
        for(i in moveList.indices){
            if(it == moveList[i]){
                nx = cx + dirCoordinate[i].x
                ny = cy + dirCoordinate[i].y
            }
            if (!(isRight(nx, n) && isRight(ny, n))) {
                continue
            }
            cx = nx
            cy = ny
        }
    }
    print("$cx $cy")
}

fun isRight(num: Int, n: Int) = num in (1..n)

data class Coordinate(
    val x: Int,
    val y: Int
)