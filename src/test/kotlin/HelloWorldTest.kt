import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class HelloWorldTest : FunSpec({

    val message = "안녕하세요. Kotest"

    test("안녕하세요. Kotest") {

        val result = hello(message)

        result shouldBe "안녕하세요. Kotest"
    }

    test("[Single] 안녕하세요. Kotest") {
        val result = helloSingle(message)

        result shouldBe "안녕하세요. Kotest"
    }


})

fun hello(message: String): String {
    return message
}

fun helloSingle(message: String) = message



