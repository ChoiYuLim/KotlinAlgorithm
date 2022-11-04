fun main() {
    var (N, K) = readln().split(" ").map { it.toInt() }
    var count = 0
    while (N / K > 0) {
        count += N % K +1
        N /= K
    }
//    while (N > 1) {
//        if (N % K == 0) {
//            N /= K
//        } else {
//            N -= 1
//        }
//         count += 1
//    }
    print(count)
}