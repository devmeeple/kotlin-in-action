package ch04.ObjectDeclarations

import java.io.File

object CaseInsenstiveFileComparator : Comparator<File> {
    override fun compare(file1: File, file2: File): Int {
        return file1.path.compareTo(file2.path, ignoreCase = true)
    }
}

fun main() {
    println(
        CaseInsenstiveFileComparator.compare(
            File("/User"),
            File("/user")
        )
    )
    val files = listOf(File("/Z"), File("/a"))
    println(files.sortedWith(CaseInsenstiveFileComparator))
}