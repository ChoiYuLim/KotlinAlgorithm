fun main(){
    val n = readln().map{ it.toString().toInt() }
    var answer = 0
    n.forEach{
        if(it==0 || it==1 ||answer==0 || answer==1){
            answer+=it
        }else answer *= it
    }
    print(answer)
}