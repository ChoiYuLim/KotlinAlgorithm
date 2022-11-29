import java.util.*
import kotlin.collections.ArrayList

fun main() {
    val (n, m, v) = readln().split(" ").map { it.toInt() }
    val graph = Array(n + 1) {
        ArrayList<Int>()
    }
    for (i in 1..m) {
        val (v1, v2) = readln().split(" ").map { it.toInt() }
        graph[v1].add(v2)
        graph[v2].add(v1)
    }
    graph.map{
        it.sort()
    }
    val visited = Array(n + 1) { false }
    val visitedBfs = Array(n + 1) { false }
    dfs(graph, v, visited)
    println()
    bfs(graph, v, visitedBfs)
}

fun dfs(graph: Array<ArrayList<Int>>, v: Int, visited: Array<Boolean>) {
    visited[v] = true
    print("$v ")
    for (i in graph[v]) {
        if (!visited[i]) {
            dfs(graph, i, visited)
        }
    }
}

fun bfs(graph: Array<ArrayList<Int>>, start: Int, visited_bfs: Array<Boolean>) {
    val que = LinkedList<Int>()
    que.offer(start)
    visited_bfs[start] = true // 현재 노드를 방문처리

    while (que.isNotEmpty()) {
        val x = que.poll() // 큐에서 하나의 원소를 뽑아 출력
        print("$x ")

        for (i in 0 until graph[x].size) {
            val y = graph[x][i]
            if (!visited_bfs[y]) {
                que.offer(y)
                visited_bfs[y] = true
            }
        }
    }
}