fun main (args:Array<String>){

    println("Enter the number for multiplication:")

    val num:Int= readLine()!!.toInt()

    val second = 1

    println("multiplication table for $num")

    for (second in 1..12){

        val product = num*second



        println("$num * $second = $product")
    }

}