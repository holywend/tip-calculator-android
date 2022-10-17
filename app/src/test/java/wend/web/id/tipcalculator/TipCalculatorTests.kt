package wend.web.id.tipcalculator

import org.junit.Assert.assertEquals
import org.junit.Test
import java.text.NumberFormat

class TipCalculatorTests {
    @Test
    fun calculate_20_percent_tip_no_roundup() {
        val amount = 10.0
        val tipPercent = 20.0
        val roundUp = false
        val expected = NumberFormat.getCurrencyInstance().format(2.0)
        val actualTip = calculateTip(amount, tipPercent, roundUp)
        println("Expected: $expected, Actual: $actualTip")
        assertEquals(expected, actualTip)
    }

    @Test
    fun calculate_15_percent_tip_with_roundup() {
        val amount = 23.50
        val tipPercent = 15.0
        val roundUp = true
        val expected = NumberFormat.getCurrencyInstance().format(4.0)
        val actualTip = calculateTip(amount, tipPercent, roundUp)
        println("Expected: $expected, Actual: $actualTip")
        assertEquals(expected, actualTip)
    }
}