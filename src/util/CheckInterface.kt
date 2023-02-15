package util

interface CheckInterface {
    fun checkName(name : String): Boolean
    fun checkPhone(phone : String): Boolean
    fun checkBalance(balance: Int): Boolean
//    fun checkAll(date : OperatorData): Boolean
}