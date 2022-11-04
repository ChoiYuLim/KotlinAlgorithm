fun main() {
    val hour = readln().toInt()
    val no3in0to59 = 60 - (0..59).count { it.toString().contains('3') }
    val no3in0toHour = (hour + 1) - (0..hour).count { it.toString().contains('3') }
    print((hour + 1) * 60 * 60 - no3in0to59 * no3in0to59 * no3in0toHour)
}