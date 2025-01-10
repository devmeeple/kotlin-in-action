package tour.nullsafety

import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.shouldBe

class EmployeeServiceTest : BehaviorSpec({
    Given("Employee") {
        val notFoundId = 404

        When("회사 직원의 아이디를 검색할 수 없으면") {
            val result = salaryById(notFoundId)

            Then("0을 반환한다") {
                result shouldBe 0
            }
        }
    }
})

fun employeeById(id: Int) = when (id) {
    1 -> Employee("홍명보", 20)
    2 -> null
    3 -> Employee("오승환", 21)
    4 -> Employee("마이클 조던", 23)
    else -> null
}

fun salaryById(id: Int) = employeeById(id)?.salary ?: 0

class Employee(val name: String, var salary: Int)
