package ch04.InnerAndNestedClasses1

class Outer {
    inner class Inner {
        fun getOuterReference(): Outer = this@Outer
    }
}