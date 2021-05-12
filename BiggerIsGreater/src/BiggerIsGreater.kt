fun biggerIsGreater(w: String): String {
    val c = w.toCharArray()
    var index = c.lastIndex
    var indexOfBig = c.lastIndex
    while (--index != -1 && c[index] >= c[index + 1]) Unit
    if (index == -1) return "no answer"
    while (c[index] >= c[indexOfBig]) indexOfBig--
    c[index] = c[indexOfBig].apply { c[indexOfBig] = c[index++] }
    indexOfBig = c.lastIndex
    while (index < indexOfBig) c[index] = c[indexOfBig].apply { c[indexOfBig--] = c[index++] }
    return c.joinToString("")
}

fun main() = repeat(readLine()!!.toInt()) {
    readLine()!!
        .let(::biggerIsGreater)
        .let(::println)
}
