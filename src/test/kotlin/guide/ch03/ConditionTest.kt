package guide.ch03

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class ConditionTest {

    @Test
    fun `시험_점수는 0점 미만일 수 없다`() {
        val score = -1

        val result = assertThrows<IllegalArgumentException> {
            validateScoreIsNotNegative(score)
        }

        assertThat(result.message).isEqualTo("점수는 0 미만일 수 없다. 점수 : ${score}")

    }

    @Test
    fun `시험 점수가 50점 이상이면 통과한다`() {
        val score = 50

        val result = getPassOrFail(score)

        assertThat(result).isEqualTo("통과")
    }

    @Test
    fun `80점대는 B 등급이다`() {
        val score = 89

        val result = getGradeWithWhen(score)

        assertThat(result).isEqualTo("B")
    }

    private fun validateScoreIsNotNegative(score: Int) {
        if (score < 0) {
            throw IllegalArgumentException("점수는 0 미만일 수 없다. 점수 : ${score}")
        }
    }

    private fun getPassOrFail(score: Int): String {
        if (score >= 50) {
            return "통과"
        }

        return "과락"
    }


    private fun getGradeWithWhen(score: Int): String {
        return when (score) {
            in 90..100 -> "A"
            in 80..89 -> "B"
            in 70..79 -> "C"
            else -> "D"
        }
    }
}
