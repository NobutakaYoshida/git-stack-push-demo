package org.example

class PaymentService(private val notificationService: NotificationService) {
    fun processPayment(amount: Int) {
        println("Processing payment of $$amount")
        // 仮実装の機能Bを呼び出す（コンパイルエラーにならない！）
        notificationService.sendNotification("Payment of $$amount succeeded")
    }
}