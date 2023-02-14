package util

import data.OperatorData

interface CheckInterface {
    fun checkName(name : String): Boolean
    fun checkPhone(phone : String): Boolean
    fun checkBalance(balance : Double): Boolean
//    fun checkAll(date : OperatorData): Boolean
}