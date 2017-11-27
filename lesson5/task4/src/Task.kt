fun renderProductTable(): String {
    return html {
        table {
            tr(color = getTitleColor()) {
                td {
                    text("Product")
                }
                td {
                    text("Price")
                }
                td {
                    text("Popularity")
                }
            }
            val products = getProducts()
            products.forEach {
                val rowIndex = products.indexOf(it)
                tr {
                    td(color = getCellColor(0, rowIndex)) { text(it.description) }
                    td(color = getCellColor(1, rowIndex)) { text(it.price) }
                    td(color = getCellColor(2, rowIndex)) { text(it.popularity) }
                }
            }
        }
    }.toString()
}

fun getTitleColor() = "#b9c9fe"
fun getCellColor(index: Int, row: Int) = if ((index + row) % 2 == 0) "#dce4ff" else "#eff2ff"
