package atomic.classes

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe
import io.kotest.matchers.shouldNotBe
import io.kotest.matchers.types.shouldBeInstanceOf

class ClassTest : FunSpec({
    test("클래스 헤더와 본문은 선택 사항이다") {
        val book = EmptyBook()

        book shouldNotBe null
        book.shouldBeInstanceOf<EmptyBook>()
    }

    test("클래스에 소속된 함수는 멤버 함수다") {
        val title = "아토믹 코틀린"
        val book = Book(title)

        val result = book.introduce()

        result shouldBe "반갑습니다. 아토믹 코틀린"
    }

    test("최상단(top-level) 함수 선언이 가능하다") {
        val title = "아토믹 코틀린"

        val result = introduce(title)

        result shouldBe "반갑습니다. 아토믹 코틀린"
    }

    test("override 키워드를 사용하여 함수를 재정의 한다") {
        val rectangle = Rectangle()

        val result = rectangle.draw()

        result shouldBe "직사각형 완성!"
    }
})

class EmptyBook

class Book(private val title: String) {
    fun introduce() = "반갑습니다. $title"
}

fun introduce(title: String) = "반갑습니다. $title"

abstract class Polygon {
    abstract fun draw(): String
}

class Rectangle : Polygon() {
    override fun draw(): String {
        return "직사각형 완성!"
    }

}
