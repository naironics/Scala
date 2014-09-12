/* Scala Progam to demonstrate the difference between
    to and until in a for loop */
    
object ToAndUntilExample {
    def main(args : Array[String]){
            PrintToExample()
        PrintUntilExample()
    }
    
    // To prints upto 10
    def PrintToExample(){
        println("Printing using to...")
        for (i <- 0 to 10){
            println(i)
        }
    }
    
    // Until prints upto 9
    def PrintUntilExample(){
        println("Printing using until...")
        for (i <- 0 until 10){
            println(i)
        }
    }

}


