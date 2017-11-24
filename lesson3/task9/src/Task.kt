// Return customers who have more undelivered orders than delivered
fun Shop.getCustomersWithMoreUndeliveredOrdersThanDelivered(): Set<Customer> {
    val (withMoreUnDelivered) = customers.partition {
        val countDelivered = it.orders.count { it.isDelivered }
        val countNotDelivered = it.orders.count { !it.isDelivered }
        countNotDelivered > countDelivered
    }
    return withMoreUnDelivered.toSet()
}
