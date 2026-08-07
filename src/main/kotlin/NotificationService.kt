package org.example

class NotificationService(private val paymentService: PaymentService) {
    fun sendPaymentNotification() {
        // 仮実装の機能Aから決済結果を取得して通知を作成（コンパイルエラーにならない！）
        val result = paymentService.getLatestPaymentResult()

        if (result.isSuccess) {
            println("Notification Sent: Payment ${result.paymentId} was successful.")
        } else {
            println("Notification Sent: Payment ${result.paymentId} failed.")
        }
    }
}