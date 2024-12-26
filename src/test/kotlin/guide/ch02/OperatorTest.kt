package guide.ch02

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class OperatorTest {

    @Test
    fun `동등성(Equality) 객체의 값을 비교한다`() {
        val num1 = 10
        val num2 = 10

        val result = (num1 == num2)

        assertThat(result).isTrue()
        assertThat(num1.equals(num2)).isTrue()
    }

    @Test
    fun `동일성(Identity) 주소를 비교한다`() {
        val num1 = 10
        val num2 = 10

        val result = (num1 === num2)

        assertThat(result).isTrue()
    }

}

