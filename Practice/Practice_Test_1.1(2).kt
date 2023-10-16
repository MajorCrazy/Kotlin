fun main(args: Array<String>) {
    var countA = 0
    var countT = 0
    var countG = 0
    var countC = 0
    val input = readlnOrNull()
    if (input != null) {
        val numbers = input.map { it.toString() }
        for (count in numbers) {
            if (count == "A") {
                countA++
            }
        }
        for (count in numbers) {
            if (count == "T") {
                countT++
            }
        }
        for (count in numbers) {
            if (count == "G") {
                countG++
            }
        }
        for (count in numbers) {
            if (count == "C") {
                countC++
            }
        }
    }
    println("$countA $countT $countG $countC")
}
