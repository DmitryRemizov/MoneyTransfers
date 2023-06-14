const val Percent = 0.0075
const val Rouble = 100
const val MinPay = 35.0 * Rouble

fun main () {
    print("Введите сумму перевода (руб.): ")
    val amount = readln().toDouble() * Rouble
    val commission = amount * Percent
    val finalCommission = if (commission <= MinPay) MinPay else commission
    val commissionRub = finalCommission / Rouble
    println("Комиссия за перевод составит $commissionRub руб.")
}