package tour.classes

import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.shouldBe

class DeclareDataClassTest : BehaviorSpec({
    Given("Person") {
        val name = Name("John", "Smith")
        val address = Address("123 Fake Street", City("Springfield", "US"))
        val ownsAPet = false

        When("Person 객체를 선언하고") {
            val result = Person(name, address, ownsAPet)

            Then("프로퍼티 값을 검증한다") {
                result.name.first shouldBe "John"
                result.name.last shouldBe "Smith"

                result.address.street shouldBe "123 Fake Street"
                result.address.city.name shouldBe "Springfield"
                result.address.city.countyCode shouldBe "US"

                result.ownsAPet shouldBe false
            }
        }
    }
})

data class Person(val name: Name, val address: Address, val ownsAPet: Boolean = true)

data class Name(val first: String, val last: String)
data class Address(val street: String, val city: City)
data class City(val name: String, val countyCode: String)
