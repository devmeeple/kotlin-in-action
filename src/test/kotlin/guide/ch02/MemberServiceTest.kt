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

    @Test
    fun `이메일을 입력하지 않으면 기본값을 할당한다`() {
        val email: String? = null

        val result = signUp(email)

        assertThat(result).isEqualTo("unknown@example.com")
    }

    @Test
    fun `이름, 나이, 이메일을 포함한 회원을 가입한다`() {
        val member = Member("유재석", 53)

        assertThat(member.name).isEqualTo("유재석")
        assertThat(member.age).isEqualTo(53)
        assertThat(member.email).isEqualTo("unknown@example.com")
    }

    @Test
    fun `회원가입 후 이메일을 변경할 수 있다`() {
        val member = Member("유재석", 53)

        member.email = "youquizontheblock@example.com"

        assertThat(member.email).isEqualTo("youquizontheblock@example.com")
    }
}

data class Member(val name: String, val age: Int, var email: String? = "unknown@example.com")

// TODO 파라미터 기본값을 할당할 수 없을까, Elvis 연산자로 문제를 해결해야 할까?
fun signUp(email: String?): String {
    val defaultEmail = "unknown@example.com"
    return email ?: defaultEmail
}
