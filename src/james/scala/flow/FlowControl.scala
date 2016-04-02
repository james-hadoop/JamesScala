package james.scala.flow

object FlowControl {
    def main(args: Array[String]) {
        //doWhile

        println(looper(16, 24))
        println

        val file = if (!args.isEmpty) args(0) else "FlowControl.xml"
        println(file);
        println

        for (i <- 1 to 10) {
            print(i + "  ");
        }
        println("\n")

        val files = (new java.io.File(".")).listFiles()
        for (file <- files) {
            println(file)
        }
        println
        
        val n=99
        val file2Open="FlowControl.txt"
        
//        openFile(file2Open)
//        
//        try{
//            val half=if(n%2==0)n/2 else throw
//                new RuntimeException("n must be even
//        }catch{
//            case e:Exception=>println("The exception is: "+e.getMessage())
//        }finally{
//            close(file2Open)
//        }
    }

    def doWhile() {
        var line = ""

        do {
            line = readLine()
            println("Read: " + line)
        } while (line != "")
    }

    def looper(x: Long, y: Long): Long = {
        var a = x
        var b = y

        while (a != 0) {
            val temp = a
            a = b % a
            b = temp
        }

        b
    }
}