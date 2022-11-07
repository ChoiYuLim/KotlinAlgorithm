class Solution {
    fun solution(babbling: Array<String>): Int {
        val regex = "aya|ye|woo|ma".toRegex()
        val exception = listOf("ayaaya", "yeye", "woowoo", "mama")
        val babblingList = babbling.toMutableList()
        babblingList.removeIf {
            it.contains(exception[0]) || it.contains(exception[1]) || it.contains(exception[2]) || it.contains(exception[3])
        }
        return babblingList.map { it.replace(regex, "") }.count { it.isEmpty() }
    }
}