val list = mutableListOf<Int>()
val pick = mutableListOf<Int>()
var visit = BooleanArray(0)

fun main(){
    val n = readln().toInt()
    for(i in 1..n){
        list.add(i)
    }
    val visited = BooleanArray(list.size){false}
    visit = visited
    permutation(0,n)

}

fun permutation(cnt: Int, depth: Int){
    if(cnt==depth){
        pick.forEach{
            print("$it ")
        }
        println()
        return
    }
    for(i in list.indices){
        if(!visit[i]){
            visit[i]=true
            pick.add(list[i])
            permutation(cnt+1, depth)
            pick.removeAt(pick.lastIndex)
            visit[i] = false
        }
    }
}