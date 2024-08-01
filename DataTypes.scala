// object is a singleton instance that is lazily iniatizing when it is first accessed.
object DataTypes {
  def main(args: Array[String]):Unit={
    //Immutable Datatypes
    //Integer Data type

    val intNum :Int = 20
    val longNum :Long = 1234567890L
    val shortNum: Short = 32765
    val byteNum: Byte = 127

    // Floating Datatypes
    val FloatingNum:Float = 3.14f //f to decalre datatypes
    val doubleNum: Double = 3.14159364687666

    //String Datatypes

    val stringvar: String = "Hello Scala"

    // Character Datatypes

    val charVar: Char ='A'

    //Unit Datatypes

    val unitValue: Unit = ()

    //Printing values
    println(s"Integer: $intNum")
    println(s"Long Integer: $longNum")
    println(s"Short Integer: $shortNum")
    println(s"Byte Integer: $byteNum")
    println(f"Floating Number: $FloatingNum")


    //Mutable Datatypes
    //Boolean -true,false

    var boolvar : Boolean = true
    println("Boolean: " + boolvar)

    var intVar : Int = 1234
    println("Integer Variable: " + intVar)

    intVar = intVar + 1000
    println("Updated Variable: " + intVar)

//    intNum = intNum + 100






  }
}