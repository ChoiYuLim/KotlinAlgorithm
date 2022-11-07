class Solution {
    val wordList = listOf("aya", "ye", "woo", "ma")
    val canSpeakableList = mutableListOf("aya", "ye", "woo", "ma")
    val picked = mutableListOf<String>()
    val visited = BooleanArray(wordList.size) { false }

    fun solution(babbling: Array<String>): Int {
        var answer = 0

        permutation(0, 2)
        permutation(0,3)
        permutation(0,4)

        babbling.forEach {
            if (canSpeakableList.contains(it)) answer += 1
        }
        return answer
    }

    fun permutation(cnt: Int, depth: Int) {
        var word = ""
        if (cnt == depth) {
            picked.forEach {
                word += it
            }
            canSpeakableList.add(word)
            word = ""
            return
        }
        for (i in 0 until wordList.size) {
            if (!visited[i]) {
                visited[i] = true
                picked.add(wordList[i])
                permutation(cnt + 1, depth)
                picked.removeAt(picked.lastIndex)
                visited[i] = false
            }
        }
    }
}