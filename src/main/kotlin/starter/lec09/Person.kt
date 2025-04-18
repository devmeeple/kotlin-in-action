package starter.lec09

/**
 * primary constructor
 * secondary constructor
 * default parameter
 * 정적 팩토리 메서드
 * custom getter, setter
 *  객체의 속성이라면 custom getter 권장, 그렇지 않다면 함수
 * backing field
 */

class Person(
    val name: String = "장태근",
    var age: Int = 1,
) {

    init {
        if (age <= 0) {
            throw IllegalArgumentException("나이는 ${age}일 수 없습니다")
        }
        println("초기화 블록")
    }

    val isAdult: Boolean
        get() = age >= 20
}