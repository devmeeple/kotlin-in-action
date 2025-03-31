package start.ch04

import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.shouldBe

class DistanceExTest : BehaviorSpec({
    Given("거리가 주어졌을 때") {
        When("1km 이하면") {
            val distance = 1
            val result = getVehicleOf(distance)

            Then("도보를 선택한다") {
                result shouldBe "도보"
            }
        }

        When("10km 이하면") {
            val distance = 10
            val result = getVehicleOf(distance)

            Then("자전거를 선택한다") {
                result shouldBe "자전거"
            }
        }

        When("100km 이하면") {
            val distance = 100
            val result = getVehicleOf(distance)

            Then("자동차를 선택한다") {
                result shouldBe "자동차"
            }
        }

        When("100km 초과면") {
            val distance = 101
            val result = getVehicleOf(distance)

            Then("비행기를 선택한다") {
                result shouldBe "비행기"
            }
        }
    }
})

private fun getVehicleOf(distance: Int): String {
    return when {
        distance <= 1 -> "도보"
        distance <= 10 -> "자전거"
        distance <= 100 -> "자동차"
        else -> "비행기"
    }
}