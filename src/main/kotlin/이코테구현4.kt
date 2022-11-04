fun main() {
    val str = readln()
    var sum = 0
    val charList = mutableListOf<Char>()
    str.map {
        if (it.isDigit()) {
            sum += it.toString().toInt()
        } else{
            charList.add(it)
        }
    }
    print(charList.sorted().joinToString("")+sum.toString())
}