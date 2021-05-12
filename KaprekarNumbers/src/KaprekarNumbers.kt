import kotlin.math.log10
import kotlin.math.pow

fun isKaprekar(n: Int): Boolean {
    val square = n.toLong() * n
    val d = log10(n.toDouble()).toInt() + 1
    val pow = (10.0).pow(d).toInt()
    return square / pow + square % pow == n.toLong()
}

fun kaprekarNumbers(p: Int, q: Int) = (p..q)
    .filter(::isKaprekar)
    .let { if (it.isEmpty()) "INVALID RANGE" else it.joinToString(" ") }
    .let(::println)

fun main() = kaprekarNumbers(readLine()!!.toInt(), readLine()!!.toInt())