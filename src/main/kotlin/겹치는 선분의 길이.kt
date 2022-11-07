class Solution {
    fun solution(lines: Array<IntArray>): Int {
        var answer = 0
        var list = mutableMapOf<Int, Int>()
        lines.forEach{ i->
            (i[0] until i[1]).forEach{
                list[it] = list[it]?.plus(1) ?: 1
            }
        }
        list.forEach{
            if(it.value>1) answer++
        }
        return answer
    }
}