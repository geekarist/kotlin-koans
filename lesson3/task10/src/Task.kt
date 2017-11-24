// Return the set of products that were ordered by every customer
fun Shop.getSetOfProductsOrderedByEveryCustomer(): Set<Product> {
    val allProducts = customers
            .flatMap { it.orders }
            .flatMap { it.products }
    val commonProducts = customers.fold(allProducts,
            fun (productAccu: List<Product>, customer: Customer): List<Product> {
                val customerProducts = customer.orders.flatMap { it.products }
                return productAccu.intersect(customerProducts).toList()
            })
    return commonProducts.toSet()
}
