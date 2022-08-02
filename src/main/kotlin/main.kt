fun main() {
    val ammount = cardPayCommission("Мир", transaction = 40011.0)
    println("Комиссия составила: ${String.format("%.2f",ammount)} руб.")
}

fun cardPayCommission(cardName: String, transactionStart: Double = 0.0, transaction: Double): Double {
    return when (cardName) {
        "Mastercard", "Maestro" -> {
            if (transactionStart > 75000.0) transaction * 0.006 + 20.0 else 0.0
        }

        "Visa", "Мир" -> {Math.max(transaction * 0.0075, 35.0)}

        else -> 0.0
    }
}