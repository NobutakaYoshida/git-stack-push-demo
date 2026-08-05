package org.example

class CartService {
    private val items = mutableListOf<CartItem>()

    fun addItem(productId: Long, quantity: Int, price: Int) {
        items.add(CartItem(productId, quantity, price))
    }

    fun calculateTotal(): Int = items.sumOf { it.price * it.quantity }
}