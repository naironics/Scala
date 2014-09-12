/* Scala program to print out
    whether a given number is
    Prime or not 
    Usage : PrimeNumberCheck 23 */

object PrimeNumberCheck {

    def main(args : Array[String]){
        val x = args(0).toInt
        println(CheckPrime(x))
    }


    def CheckPrime(n : Int) : String = {
        for(i <- 2 to (n/2)){
            if(n % i == 0) {
                return "Number is not Prime"
            }
        }
        return "Number is Prime"
    }

}






