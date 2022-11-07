class Solution {
    fun solution(array: IntArray): Int {
        val map = mutableMapOf<Int, Int>()
        array.forEach {
            map[it] = map[it]?.plus(1) ?: 1
        }
        map.toList().sortedByDescending { it.second }.apply {
            return if (map.size != 1 && this[0].second == this[1].second) -1
            else this[0].first
        }
    }
}