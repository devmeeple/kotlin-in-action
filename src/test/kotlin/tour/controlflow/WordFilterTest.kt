package tour.controlflow

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.collections.shouldContainExactly
import io.kotest.matchers.collections.shouldHaveSize

class WordFilterTest : FunSpec({
    test("[l]로 시작하는 단어를 조회한다") {
        val words = listOf("dinosaur", "limousine", "magazine", "language")
        val keyword = 'l'

        val results = words.filter { it.startsWith(keyword) }

        results shouldHaveSize 2
        results shouldContainExactly listOf("limousine", "language")
    }
})
