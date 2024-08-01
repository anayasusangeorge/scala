object vowels{
  def main(args: Array[String]): Unit = {
    import scala.collection.mutable.ArrayBuffer

    val arr = ArrayBuffer[String]()
    var x = 1
    import scala.io.StdIn
    while (x <= 5){
      val input = StdIn.readLine()
      arr += input
      x += 1
    }

    val grpc = arr.groupBy(nam => if("AEIOUaeiou".contains(nam.head)) "Vowels" else "Consonants")
    for ((key,value)<-grpc){
      println(key)
      value.foreach(println)
    }

  }
}
