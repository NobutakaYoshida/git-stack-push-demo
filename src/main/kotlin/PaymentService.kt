package org.example

// ★仮実装: 機能Aが完成するまでのダミーデータ・クラス
data class PaymentResult(val paymentId: String, val isSuccess: Boolean)

class PaymentService {
    fun getLatestPaymentResult(): PaymentResult {
        // 仮のテストデータを返す
        return PaymentResult(paymentId = "PAY-MOCK-1234", isSuccess = true)
    }
}