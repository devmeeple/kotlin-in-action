package atomic.classes

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldNotBe
import io.kotest.matchers.types.shouldBeInstanceOf

class ClassTest : FunSpec({
    test("클래스 헤더와 본문은 선택 사항이다") {
        val book = EmptyBook()

        book shouldNotBe null
        book.shouldBeInstanceOf<EmptyBook>()
    }
})

class EmptyBook
