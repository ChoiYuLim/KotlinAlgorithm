fun main() {
    val n = readln().toInt()
    val list = readln().split(" ").map { it.toInt() }
    var people = 0
    var groupCnt = 0
    list.sorted().forEach {
        people++
        if (people >= it) {
            groupCnt += 1
            people = 0
        }
    }
    print(groupCnt)
}