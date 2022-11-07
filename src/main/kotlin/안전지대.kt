class Solution {
    fun solution(board: Array<IntArray>): Int {
        var answer: Int = 0
        val n = board.size
        val list = Array(n) { BooleanArray(n){true} }
        board.forEachIndexed{ j, ints ->
            ints.forEachIndexed { k, i ->
                if(i==1){
                    (j-1 ..j+1).forEach{l->
                        if(l in 0 until n){
                            (k-1..k+1).forEach{m->
                                if(m in 0 until n) {
                                    list[l][m] = false
                                }
                            }
                        }
                    }
                }
            }
        }
        list.forEach{ it -> answer += it.count{ it }}
        return answer
    }
}