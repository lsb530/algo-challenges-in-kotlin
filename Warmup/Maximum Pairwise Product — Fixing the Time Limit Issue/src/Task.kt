fun maximumPairwiseProduct(a: IntArray): Long {
    var m1 = Int.MIN_VALUE
    var m2 = Int.MIN_VALUE
    for (x in a) {
        if (x > m1) {
            m2 = m1
            m1 = x
        } else if (x > m2) {
            m2 = x
        }
    }
    return m1.toLong() * m2
}