package operator

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class OperatorTest {

    @Test
    fun `정수의 평균을 계산한다`() {
        val num1 = 10
        val num2 = 20
        val num3 = 30
        val sum = num1 + num2 + num3

        val average = sum / 3;

        assertThat(sum).isEqualTo(60)
        assertThat(average).isEqualTo(20)
    }

}
