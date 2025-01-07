package tour.collections

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class PizzaSliceCounterTest : FunSpec({
    test("[while] 피자가 8조각이면 프로그램을 종료한다") {
        val result = countSlicesUsingWhile()

        result shouldBe 8
    }
})

const val PIZZA_MAX_SLICES = 8

fun countSlicesUsingWhile(): Int {
    var slices = 0
    while (slices < PIZZA_MAX_SLICES) {
        slices++
    }

    return slices
}
