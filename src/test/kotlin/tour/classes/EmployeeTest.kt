package tour.classes

import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.shouldBe

class EmployeeTest : BehaviorSpec({
    Given("Employee name, salary") {
        val employee = Employee("장태근", 5000000)

        When("급여가 인상되면") {
            employee.salary += 100000
            
            Then("인상된 결과를 반영한다") {
                employee.salary shouldBe 5100000
            }
        }
    }
})

data class Employee(
    val name: String,
    var salary: Int
)
