package guide.ch02

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class NullSafeTest {

    @Test
    fun `도서 제목의 시작 문자를 검증한다`() {
        val book = "Clean Code"

        val result = startsWith(book)

        assertThat(result).isTrue()
    }

    @Test
    fun `도서 제목을 입력하지 않으면 에러가 발생한다`() {
        val book: String? = null

        val result = assertThrows<IllegalArgumentException> {
            startsWithOrThrow(book)
        }

        assertThat(result.message).isEqualTo("책 제목을 입력해 주세요")
    }

    @Test
    fun `도서 제목을 입력하지 않으면 null을 반환한다`() {
        val book: String? = null

        val result = startsWithOrNull(book)

        assertThat(result).isNull()
    }

    @Test
    fun `도서 제목을 입력하지 않으면 false를 반환한다`() {
        val book: String? = null

        val result = startsWithOrFalse(book)

        assertThat(result).isFalse()
    }

    private fun startsWith(book: String): Boolean {
        return book.startsWith("C")
    }

    private fun startsWithOrThrow(book: String?): Boolean {
        return book?.startsWith("C")
            ?: throw IllegalArgumentException("책 제목을 입력해 주세요")
    }

    private fun startsWithOrNull(book: String?): Boolean? {
        return book?.startsWith("A")
    }

    private fun startsWithOrFalse(book: String?): Boolean {
        return book?.startsWith("C") ?: false
    }

}
