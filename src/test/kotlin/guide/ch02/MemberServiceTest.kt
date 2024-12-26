package guide.ch02

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class MemberServiceTest {

    @Test
    fun `회원가입 시 이름은 변경 가능하다`() {
        var name = "조세호"

        name = "유재석"

        assertThat(name).isEqualTo("유재석")
    }

    @Test
    fun `회원가입 후 고유 ID는 변경할 수 없다`() {
        val id = 1

        assertThat(id).isEqualTo(1)
    }
}
