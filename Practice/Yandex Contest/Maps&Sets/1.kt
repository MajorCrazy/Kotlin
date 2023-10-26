fun main(args: Array<String>) {
    val goods = readln().replace(",", "").split(" ").chunked(2)
    println(goods)
    val shop = readln().split(" ")
    val map = goods.map {it[0] to it[1].toInt()}
    println(map)
    val result = map.filter { (k, v) -> k in shop}.map {it.second }.sum()
    print(result)
}
