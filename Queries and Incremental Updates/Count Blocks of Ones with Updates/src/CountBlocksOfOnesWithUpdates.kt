class CountBlocksOfOnesWithUpdates(seq: CharSequence) {
    // write required fields and methods here
    private val seq = CharArray(seq.length) { seq[it] }

    fun countOnes(): Int = seq.count { it == '1' }

    fun countBlocksOfOnes(): Int {
        var oneBlocks = 0
        var isRecentlyOne = false
        for (c in seq) {
            val isOne = c == '1'
            if (isOne) {
                if (!isRecentlyOne) {
                    oneBlocks++
                }
            }
            isRecentlyOne = isOne
        }
        return oneBlocks
    }

    fun flip(index: Int) {
        seq[index] = if (seq[index] == '1') '0' else '1'
    }
}
