package ch04.AccessingABackingFieldFromAGetterOrSetter1

class Person(var birthYear: Int) {
    var ageIn2050
        get() = 2050 - birthYear
        set(value) {
            birthYear = 2050 - value
        }
}