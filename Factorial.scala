/* Scala Program to print Factorial
    of a given number 
    Usage   : scala Factorial number 
    Example : scala Factorial 7   */

object Factorial {
    def main(args: Array[String]){
        val x = args(0).toInt
        println(Factorial(x))
    }

    def Factorial(n : Int): Int =
        if (n <= 0) 1 else n * Factorial(n-1)

}


    
