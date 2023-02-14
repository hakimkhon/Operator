import data.OperatorData
import util.SortInterface
import util.UserInterface

class User : UserInterface, SortInterface {
    private val userList: ArrayList<OperatorData> = ArrayList()

    private fun sortingType() {
        println(
            """
            Saralash:
            1 - Kompaniya bo'yicha
            2 - Balans holati bo'yicha
            3 - Ism bo'yicha
            4 - Orqaga
        """.trimIndent()
        )
        print("Tanlash: ")

        when (readln().toInt()) {
            1 -> sortByBalance()
            2 -> sortByName()
            3 -> sortByCompany()
            4 -> print("")
            else -> sortingType()
        }
    }

    override fun sortByName() {
        TODO("Not yet implemented")
    }

    override fun sortByBalance() {
        TODO("Not yet implemented")
    }

    override fun sortByCompany() {
        TODO("Not yet implemented")
    }

    override fun addUser() {
        TODO("Not yet implemented")
    }

    override fun deleteUser() {
        TODO("Not yet implemented")
    }

    override fun updateUser() {
        TODO("Not yet implemented")
    }

    override fun findUser() {
        TODO("Not yet implemented")
    }

    override fun allUsers() {
        TODO("Not yet implemented")
    }

}