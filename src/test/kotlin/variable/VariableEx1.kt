package variable

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class VariableEx1 {
    @Test
    fun `변수를 사용하는 이유`() {
        val num1 = 4
        val num2 = 3

        assertThat(num1).isEqualTo(4)
        assertThat(num2).isEqualTo(3)
    }

    @Test
    fun `두 변수의 합을 계산한다`() {
        val num1 = 10
        val num2 = 20

        val sum = num1 + num2

        assertThat(sum).isEqualTo(30)
        println()
    }
}
