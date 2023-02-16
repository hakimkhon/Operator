import data.OperatorData

fun main() {
    var isExit = true
    val user = User()
    user.loadUser()
    while (isExit) {
        println("""
            1 - Abonentlar ro'yxati
            2 - Abonent qo'shish
            3 - Abonent o'chirish
            4 - Abonent qidirish
            5 - Chiqish
        """.trimIndent())
        print("Tanlang: ")

        when(readln().toInt()) {
            1 -> user.sortingType()
            2 -> user.addUser()
            3 -> user.deleteUser()
            4 -> user.findUser()
            5 -> {
                isExit = false
                print("Hayr salomat bo'ling")
            }
            else -> {
                print("")
            }
        }
    }

}