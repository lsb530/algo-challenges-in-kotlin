
fun countBlocksOfOnes(seq: CharSequence): Int {
//    var oneBlocks = 0
//    var findOne = false
//    for (c in seq) {
//        if (c == '1') {
//            findOne = true
//        } else {
//            findOne = false
//            oneBlocks += 1
//        }
//    }
//    return oneBlocks
    var oneRecently = false
    var blocksCount = 0
    for (c in seq) {
        val isOne = c == '1'
//        print("c = $c, isOne = $isOne, oneRecently = $oneRecently")
        if (isOne) {
            if (!oneRecently) {
                blocksCount += 1
            }
        }
//        println(", blocksCount = $blocksCount")
        oneRecently = isOne
    }
    return blocksCount

}

fun main() {
    println(countBlocksOfOnes("001001"))
    println(countBlocksOfOnes("11100101"))
}