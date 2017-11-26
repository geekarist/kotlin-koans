class LazyProperty(val initializer: () -> Int) {
    private var lethargic: Int? = null

    /* TODO */
    val lazy: Int
        get() {
            if (lethargic == null) lethargic = initializer()
            return lethargic!!
        }
}
