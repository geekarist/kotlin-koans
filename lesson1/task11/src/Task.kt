import java.util.*

fun getList(): List<Int> {
    val arrayList = arrayListOf(1, 5, 2)
    Collections.sort(arrayList, { o1: Int, o2: Int -> o2 - o1})
    return arrayList
}
