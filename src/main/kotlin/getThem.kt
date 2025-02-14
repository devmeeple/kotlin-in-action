val theList = Array(3) { IntArray(3) { 0 } }

fun getThem(): List<IntArray> {
    val list1 = mutableListOf<IntArray>()
    for (x in theList)
        if (x[0] == 4)
            list1.add(x)
    return list1
}