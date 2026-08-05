package org.example

class CouponService {
    fun applyDiscount(totalAmount: Int, discountRate: Double): Int {
        return (totalAmount * (1.0 - discountRate)).toInt()
    }
}