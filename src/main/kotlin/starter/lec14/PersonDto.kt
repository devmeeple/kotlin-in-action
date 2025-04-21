package starter.lec14

fun main() {
    val dto1 = PersonDto("장태근", 100)
    val dto2 = PersonDto("장태근", 200)

    // equals
    println(dto1 == dto2)
    
    // toString
    println(dto1)
}

data class PersonDto(
    val name: String,
    val age: Int,
)