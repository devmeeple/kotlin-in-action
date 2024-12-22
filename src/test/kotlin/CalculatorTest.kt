import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CalculatorTest {
    @Test
    fun `두 수를 곱한다`() {
        val calculator = Calculator()
        val result = calculator.parse("2 * 2")
        assertThat(result).isEqualTo(4)
    }

    @Test
    fun `두 수를 나눈다`() {
        val calculator = Calculator()
        val result = calculator.parse("2 / 2")
        assertThat(result).isEqualTo(1)
    }
}
