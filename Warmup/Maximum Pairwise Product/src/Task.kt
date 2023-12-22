import kotlin.math.max

fun maximumPairwiseProduct(a: IntArray): Int {
    val len = a.size
    var res = Int.MIN_VALUE
    for (i in 0 until len) {
        for (j in i + 1 until len) {
            println("res:$res, a[i]: ${a[i]}, a[j]: ${a[j]}, mul:${a[i]*a[j]}")
            res = max(res, a[i] * a[j])
        }
    }
    return res
}

fun main() {
    val a = intArrayOf(7, 5, 14, 2, 8, 8, 10, 1, 2, 3)
    maximumPairwiseProduct(a)
}
