/* Scala program to demonstrate the use of Range 
    - scala.collection.immutable.Range  */

object RangeExample {

    def main(args : Array[String]){
        PrintExamples()
    }

    def PrintExamples(){
        val r1 = 0 until 10
        println(r1.length)  // output 10

        val r2 = r1.start until r1.end by r1.step
        println(r2.length)  // output 10

        val r3 = r1.start until r1.end by r1.step + 1
        println(r3.length) // output 5
    }

}





