package tour.classes.random

import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.collections.shouldContain
import io.kotest.matchers.comparables.shouldBeGreaterThan
import io.kotest.matchers.comparables.shouldBeLessThan
import kotlin.random.Random

class RandomEmployeeGeneratorTest : BehaviorSpec({
    Given("RandomEmployeeGenerator") {
        val minSalary = 1000
        val maxSalary = 10000
        val fixedRandom = Random(50)

        val sut = RandomEmployeeGenerator(minSalary, maxSalary, fixedRandom)

        When("무작위로 직원을 생성하면") {
            val results = sut.generateEmployee()

            Then("직원의 이름은 미리 정의된 이름 목록에 있어야 한다") {
                val validNames = listOf("조영호", "로이 오셔로브", "블라디미르 코리코프")
                validNames.shouldContain(results.name)
            }

            Then("직원의 급여는 유효한 범위(최저, 최고 금액) 내에 포함되어야 한다") {
                results.salary shouldBeGreaterThan minSalary
                results.salary shouldBeLessThan maxSalary
            }
        }
    }
})

class RandomEmployeeGenerator(
    private var minSalary: Int,
    private var maxSalary: Int,
    private val random: Random = Random
) {
    private val names = listOf("조영호", "로이 오셔로브", "블라디미르 코리코프")

    fun generateEmployee(): Employee {
        return Employee(
            names.random(random),
            Random.nextInt(from = minSalary, until = maxSalary)
        )
    }
}

