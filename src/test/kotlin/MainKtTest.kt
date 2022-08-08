import org.junit.Test

import org.junit.Assert.*

class MainKtTest {

    @Test
    fun cardPayCommission_mir() {
        val cardName = "Мир"
        val transaction = 1000.0

        val result = cardPayCommission(cardName, transaction = transaction)
        assertEquals(35.0, result, 0.0)

    }

    @Test
    fun cardPayCommission_maestro_0() {
        val cardName = "Maestro"
        val transaction = 1000.0

        val result = cardPayCommission(cardName, transaction = transaction)

        assertEquals(0.0, result, 0.0)
    }

    @Test
    fun cardPayCommission_Mastercard_75000() {
        val cardName = "Mastercard"
        val transactionStart = 75000.1
        val transaction = 1000.0

        val result = cardPayCommission(cardName,transactionStart,transaction)

        assertEquals(26.0,result,0.0)
    }

    @Test
    fun cardPayCommission_vk() {
        val cardName = "VKPay"
        val transaction = 10000.0

        val result = cardPayCommission(cardName,transaction = transaction)

        assertEquals(0.0,result,0.0)
    }

    @Test
    fun cardPayCommission_visa() {
        val cardName = "Visa"
        val transaction = 10000.0

        val result = cardPayCommission(cardName,transaction = transaction)

        assertEquals(75.0,result,0.0)
    }
}