fun main() {
    val musicLover = true
    val previousPurchase = 10_001
    val itemPrice = 100
    val itemCount = 11
    var result: Double = 0.0
    var preResult: Double = 0.0
    var result1: Double = 0.0

    if (previousPurchase >= 1_001 && previousPurchase <= 10_000) {
        result1 = itemPrice * itemCount - 100.00
    } else if (previousPurchase >= 10_001) {
        result1 = itemPrice * itemCount * 0.95
    } else if (previousPurchase <= 1_000) {
        result1 = (itemPrice * itemCount).toDouble()
    }
    result = if (musicLover) {
        result1 * 0.99
    } else {
        result1
    }
     preResult = (itemPrice * itemCount).toDouble()
     println("Сумма покупки без скидки: $preResult")
     println("Итоговая сумма покупки: $result")
}
