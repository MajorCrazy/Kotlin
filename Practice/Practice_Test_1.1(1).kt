fun main() {
    val input = readLine()
    if (input != null) {
        val (a, b, m, n) = input.split(" ").map { it.toDouble() }
        if ((a >= m && b >= n) || (a >= n && b >= m)) {
            println("YES")
        }  else {
        println("NO") }
    }
}
