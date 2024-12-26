package guide.ch02

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class BasicTypeTest {

    @Test
    fun `Int 타입을 Long 타입으로 명시적으로 변경한다`() {
        val num1 = 10

        val result = num1.toLong()

        assertThat(result).isEqualTo(10L)
    }

    @Test
    fun `Person 타입이라면 나이를 출력한다`() {
        val obj = Person(19)

        val result = printAgeIfPerson(obj)

        assertThat(result).isEqualTo(19)
    }

    @Test
    fun `String interpolation 활용하기(Template literals)`() {
        val person = Person(19)

        val result = "내 나이 ${person.age}세, 이젠 오직 돈 생각뿐이다"

        assertThat(result).isEqualTo("내 나이 19세, 이젠 오직 돈 생각뿐이다")
    }

    @Test
    fun `String interpolation 활용하기(여러 줄) (2)`() {
        val message = """
            ABC
            EFG
            HJI
        """.trimIndent()

        assertThat(message).isEqualTo(
            """
            ABC
            EFG
            HJI
        """.trimIndent()
        )
    }

    @Test
    fun `String indexing 문자열을 배열처럼 다뤄 문자를 가져온다`() {
        val str = "서머싯몸"

        val result = str[3]

        assertThat(result).isEqualTo('몸')
    }


    private fun printAgeIfPerson(obj: Any): Int {
        if (obj is Person) {
            return obj.age
        }

        throw IllegalArgumentException("Person 타입이 아닙니다")
    }
}

data class Person(val age: Int)
