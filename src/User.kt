import data.OperatorData
import util.SortInterface
import util.UserInterface

class User : UserInterface, SortInterface {
    private val userList: ArrayList<OperatorData> = ArrayList()

    fun operators() {
        println(
            """
            1 - UCELL
            2 - BEELINE
            3 - UZMOBILE
            4 - MOBIUZ
            5 - BARCHASI
            0 - ORQAGA
        """.trimIndent()
        )
        print("Tanlang: ")

        when (readln().toInt()) {
            0 -> print("")
            1 -> sortByBalance()
            2 -> sortByName()
            3 -> sortByCompany()
            4 -> print("")
            5 -> sortingType()
            else -> operators()
        }
    }

    fun sortingType() {
        println(
            """
            *** Saralash ***
            1 - Kompaniya bo'yicha
            2 - Balans holati bo'yicha
            3 - Ism bo'yicha
            0 - Orqaga
        """.trimIndent()
        )
        print("Tanlang: ")

        when (readln().toInt()) {
            0 -> print("")
            1 -> sortByCompany()
            2 -> sortByBalance()
            3 -> sortByName()
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

    fun printInfo(user: OperatorData){
        print("${user.fullName} -> ${user.phoneNumber} ${user.balance} so'm | ${user.company}")
    }

    fun loadUser(){
        userList.add(OperatorData("Nozim Umarov", "+998907895201", 13540, "BEELINE"))
        userList.add(OperatorData("Shuxrat Jabborov", "+998940101078", 30050, "UCELL"))
        userList.add(OperatorData("Umida Latipova", "+998977890061", 45012, "MOBIUZ"))
        userList.add(OperatorData("Sobir Muminov", "+998953006565", 8040, "UZMOBILE"))
        userList.add(OperatorData("Ma'ruf Qosimov", "+998996501234", 500, "UZMOBILE"))
        userList.add(OperatorData("Anvar Jalolov", "+998935201010", 23011, "UCELL"))
        userList.add(OperatorData("Bobut Toshev", "+998881004700", 9481, "MOBIUZ"))
        userList.add(OperatorData("Lola Rustamova", "+998918952019", 45610, "BEELINE"))
    }

}