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

    }

    override fun sortByBalance() {

    }

    override fun sortByCompany() {

    }

    override fun addUser() {

    }

    override fun deleteUser() {

    }

    override fun updateUser() {

    }

    override fun findUser() {

    }

    override fun allUsers() {

    }

}