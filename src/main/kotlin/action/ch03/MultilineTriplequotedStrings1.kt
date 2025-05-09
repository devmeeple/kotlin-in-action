package action.ch03

fun main() {
    val expectedPage = """
        <html lang="en">
            <head>
            <title>A page</title>
            </head>
        <body>
            <p>Hello, Kotlin!</p>
        </body>
        </html>
    """.trimIndent()

    val expectedObject = """
        {
            "name": "Sebastian",
            "age": 27,
            "homeTown": "Munich"
        }
    """.trimIndent()
}