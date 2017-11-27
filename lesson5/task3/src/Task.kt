fun <T> T.myApply(f: T.() -> Unit): T {
    return this.apply(f)
}

fun createString(): String {
    return StringBuilder().apply {
        append("Numbers: ")
        for (i in 1..10) {
            append(i)
        }
    }.toString()
}

fun createMap(): Map<Int, String> {
    return hashMapOf<Int, String>().apply {
        put(0, "0")
        for (i in 1..10) {
            put(i, "$i")
        }
    }
}
