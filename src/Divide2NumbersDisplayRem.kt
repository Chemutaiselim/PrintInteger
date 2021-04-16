fun main(args:Array<String>){

    println("Enter the number:")

    val dividend:Int = readLine()!!.toInt()

    println("enter number to divide the first number")

    val divisor:Int =readLine()!!.toInt()

    val divide = dividend/divisor

    val rem= dividend % divisor


    println("the division is: $divide")

    println("the remainder $rem")
}