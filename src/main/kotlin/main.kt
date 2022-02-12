fun main() {
    val musicLover = true
    val previousPurchase = 10_001
    val itemPrice = 100
    val itemCount = 11
    var result:Double = 0.0
    var preResult:Double = 0.0

    if (previousPurchase >= 1_001 && previousPurchase <= 10_000) {
        result = itemPrice * itemCount - 100.00
    }
        else if (previousPurchase >= 10_001) {
            result = itemPrice * itemCount * 0.95
            preResult = (itemPrice * itemCount).toDouble()
        }
    if (musicLover)
       result = itemPrice * itemCount * 0.95 * 0.99
     println("Сумма покупки без скидки: $preResult")
     println("Итоговая сумма покупки: $result")
}
