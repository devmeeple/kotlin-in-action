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
}
