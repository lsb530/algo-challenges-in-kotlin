
fun countOnes(seq: CharSequence): Int {
    var cnt = 0
    for (c in seq) {
        if (c == '1') cnt++
    }
    return cnt
}
