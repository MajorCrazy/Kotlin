fun String.isValidCCNumber() : Boolean {
    val numbers = this.filter {it.isDigit()}
    var sum = 0
    for (i in numbers.indices.reversed()) {
        var digit = numbers[i].digitToInt()
        val parity = numbers.count() % 2
        if (i % 2 == parity) {
            digit *= 2
            if (digit > 9) {
                digit -= 9
            }
        }
        sum += digit
    }
    return (sum % 10) == 0
}

fun main(args: Array<String>) {
    val object1 = "4561 2612 1234 5467"
    object1.isValidCCNumber()

}
