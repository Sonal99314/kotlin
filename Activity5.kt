import java.util.*


    fun main(args: Array<String>) {
        println("Hello, World!")
        val b = Banking()
        b.initiate()
    }

internal class Banking {
    var balance = 1000

    fun initiate() {
        val login = Login()
        try {
            login.acceptInput()
            login.verify()
        } catch (e: Exception) {
            try {
                login.acceptInput()
                login.verify()
            } catch (f: Exception) {
            }
        }
    }
    infix fun add(amt: Int) {
        balance = balance + amt
        println("Amount deposited Successfully")
        println(" ")
        println("Total Balance: " + balance)
        println(" ")
    }


    fun withdrw(amt: Int) {
        println(" ")
        if (balance < amt) {
            val invalidWithDraw = InvalidBankTransaction("InValid Withdrawal Amount")
            System.out.println(invalidWithDraw.message)
        } else {
            balance = balance - amt
            println("Please Collect your $amt Rupees")
            println(" ")
            println("Total Balance: " + balance)
            println(" ")
        }
    }
}
internal class Login {
    var ac_number = 1234
    var ac_pass = 9999
    var ac = 0
    var pw = 0
    fun acceptInput() {
        val scanner = Scanner(System.`in`)
        println("Enter the account number:")
        ac = scanner.nextInt()
        println("Enter the Password:")
        pw = scanner.nextInt()
    }

    @Throws(Exception::class)
    fun verify() {
        if (ac == ac_number && pw == ac_pass) {
            println("Login Successfull!")
            val banking = Banking()
            println(" ")
            println("Your Balance is: " + banking.balance + "  Rupees")
            println(" ")
            val menu = Menu()
            menu.showMenu()
        } else {
            val loginfailed = InvalidBankTransaction("Incorrect login credentials")
            System.out.println(loginfailed.message)
            throw loginfailed
        }
    }
}
internal class Menu {
    var selectedOption = 0
    var banking = Banking()
    fun showMenu() {
        println("Please Select an option below:")
        println("Press 1 to Deposit Amount.")
        println("Press 2 to Withdraw Amount.")
        println("Press 3 to View Balance")
        println("Press any key to Exit")
        println(" ")
        val scanner = Scanner(System.`in`)
        println("Press any key:")
        selectedOption = scanner.nextInt()
        when (selectedOption) {
            1 -> {
                val d = Deposit()
                val depamt: Int = d.userInput()
                banking add(depamt) ///infix function without dot operator
                showMenu()
            }
            2 -> {
                println("Please Enter the amount to withdraw:")
                val withamt = scanner.nextInt()
                banking.withdrw(withamt)
                showMenu()
            }
            3 -> {
                println("Your Account Balance is " + banking.balance + " Rupees")
                println(" ")
                showMenu()
            }
            else -> {
                println("Transaction Ended")
                System.exit(0)
            }
        }
    }
}
 class Deposit {
    var amt = 0
    fun userInput(): Int {
        val scanner = Scanner(System.`in`)
        println("Enter the amount to be deposited: ")
        amt = scanner.nextInt()
        if (amt <= 0) {
            val depositnegativeError = InvalidBankTransaction("Invalid Deposit Amount")
            System.out.println(depositnegativeError.message)
            userInput()
        } else {
            return amt
        }
        return amt
    }


}
internal class InvalidBankTransaction(override var message: String) : Exception()