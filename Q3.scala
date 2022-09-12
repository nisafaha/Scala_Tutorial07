object Bank extends App
{
    val Acc1 = new Account("200026903590" , 1001 , 20000.00)
    val Acc2 = new Account("200026903590" , 1002 , 21300.00)
    println("Balance of Acc2 is "+Acc1.transfer(500.00, Acc2))

}

class Account ( x:String , y: Int , z : Double)
{

    val NIC : String = x
    val accountNumber : Int = y
    var balance : Double = z

    def transfer( amount : Double , Acc : Account ): Double = {
        this.balance =  this.balance - amount
        Acc.balance = Acc.balance + amount
        Acc.balance
    }

    @Override
    override def toString() : String = "NIC : " + this.NIC + "\n Account Number : " + this.accountNumber + "\n Balance : " + this.balance

}

