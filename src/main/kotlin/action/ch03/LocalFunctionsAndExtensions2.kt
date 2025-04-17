package ch03.LocalFunctionsAndExtensions2

class User(val id: Int, val name: String, val address: String)

fun saveUser(user: User) {
    fun validate(value: String, fieldName: String) {
        if (value.isEmpty()) {
            throw IllegalArgumentException(
                "Can't save user ${user.id}: empty $fieldName"
            )
        }
    }

    validate(user.name, "Name")
    validate(user.address, "Address")

    // user를 데이터베이스에 저장한다.
}

fun main() {
    saveUser(User(1, "", ""))
}
