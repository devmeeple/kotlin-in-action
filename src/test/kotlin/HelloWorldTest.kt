import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class HelloWorldTest : FunSpec({

    test("안녕하세요. Kotest") {
        val message = "안녕하세요. Kotest"

        message shouldBe "안녕하세요. Kotest"
    }
})
