fun main() {
    val input = readLine()
    if (input != null) {
        val numbers = input.split(" ").map { it.toInt() }
        if (numbers.size == 3) {
            val k = numbers[0]
            val x = numbers[1]
            val y = numbers[2]

            val diff = Math.abs(x - y)
            val MaxScore = maxOf(x, y)

            if (MaxScore >= k && diff == 0) {
                println(2)
            } else if (MaxScore < k) {
                println(k - MaxScore)
            } else if (k < MaxScore && diff >= 2) {
                println(0)
            } else if ((MaxScore >= k && diff != 0)) {
                println(diff)
            }
        }
    }
}
