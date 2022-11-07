class Solution {
    fun solution(denum1: Int, num1: Int, denum2: Int, num2: Int): IntArray {
        var up = denum1 * num2 + denum2 * num1
        var down = num1 * num2

        for(i in up downTo 1) {
            if(down % i == 0 && up % i == 0){
                up /= i
                down /= i
                break
            }
        }

        return intArrayOf(up, down)
    }
}