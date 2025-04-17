package action.ch08.PrimitiveTypes

fun showProgress(progress: Int) {
    val percent = progress.coerceIn(0, 100)
    println("We're $percent % done!")
}

fun main() {
    showProgress(146)
}