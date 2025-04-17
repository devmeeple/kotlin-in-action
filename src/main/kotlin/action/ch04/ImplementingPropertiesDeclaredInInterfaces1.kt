package ch04.ImplementingPropertiesDeclaredInInterfaces1

interface EmailUser {
    val email: String
    val nickname: String
        get() = email.substringBefore('@')
}