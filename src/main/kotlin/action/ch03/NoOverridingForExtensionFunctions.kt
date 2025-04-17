package action.ch03

open class View {
    open fun click() = println("View clicked")
}

class Button : action.ch03.View() {
    override fun click() = println("Button clicked")
}

fun main() {
    val view: action.ch03.View = action.ch03.Button()
    view.click()
}