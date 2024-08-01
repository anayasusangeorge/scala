object DataStructures{
  def main (args: Array[String]): Unit = {
    // List: Immutable,HomogenousCollectrion Of data.

    val fruits: List[String] = List("Apple","Orange","Pears","Grapes","Watermelon")
    println("First Element:" +  fruits.head)
    println("value Excluding First Element:" +  fruits.tail)
    println("Last Element:" +  fruits.last)

    val List1 = List("Haddop","Spark","Scala","Flume","Pyspark",1000,true,3.255)
    println(List1)
    println(List1.getClass)
    println(fruits.getClass)

    // Declaring an empty list

    val emptyList : List[Nothing] = List()

    //List Declaration

    val List2 = 10::20::30::Nil

    // create a list Buffer of type Mutable-> first we need to import buffer

    import scala.collection.mutable.ListBuffer
    var cities  = new ListBuffer[String]()
    cities += "Thiruvanathapuram"
    cities += ("Mumbai","Delhi","Pune")
    cities -= "Mumbai"
    println(cities)
    cities.toList   // type casting in scala is done by to and datatype function()


    // Array Data Type: aArray is mutable, fixed size collection of data structures
    // Array is Homegenous collection
    val arrayData = Array("Apple","Orange","Mango","Watermelon","Grapes")
    // prints Element by element output in new line
    arrayData.foreach(println)
    arrayData(0) = "Strawberry"
    println(arrayData.mkString(","))

    //print all values separated by comma(,)

    println(arrayData.mkString(","))

    // Declaring an empty array

    val arr_1 = new Array[String](10)  // One Dimensional
    val arr_2 = Array.ofDim[Int](2,2)  // Two Dimensional
    arr_2(0)(0) = 234
    arr_2(0)(1) = 235
    arr_2(1)(0) = 236
    arr_2(1)(1) = 237


    //print the array

    val flattenArray : Array[Int] = arr_2.flatten  //flatten-> muti dimensional to one dimensional
    println(flattenArray.mkString(", "))

    // update in 2D array

    arr_2(1)(1) = 254




    // Set Collection: Immutable collection
    // Hashset: Mutable collection of sets
    val set_1 : Set[String] = Set()

    val set_2 = Set("Apple","Mango","Orange","Gua")

    import scala.collection.mutable.Set
    val mutableSet = Set("Apple","Mango","Orange","Gua")
    mutableSet += "Blueberry"
    mutableSet -= "Apple"
    println(mutableSet)


    //Tuple Declaration -> Immutable Collection
    //In scala Tuple is fix size, Hetrogenous data types

    val Tuple_1 = (10,20,30,40,50,60,70,80) // indexing starts from 1 for tuples
    // Tuple_1._1 = "String"  // update will provide an error . bcz it is immutable
    println(Tuple_1._2) // Accessing Individual value(2nd element)


    //*********************************************************************
    // Mapping -> It is a collection key and value pair. Keys are unique and values would be duplicates
    // Mutable and Immutable maps are there. Maps are called Hash tables
    // For mutable map use "import scala.collection.immutable.Map"

    //import scala.collection.immutable.Map

    // Empty variable decalaration
    var MapVar : Map[String,Int] = Map()
    var MapVar1 = Map("UST1001" -> "Sandeep", "UST1002" -> "Midhul", "UST1003" -> "Vineesh",
      "UST1004" -> "Adinan")

    println(MapVar1.contains("UST1003")) // search for key
    println(MapVar1.get("UST1003")) // Access value using key

    println(MapVar1.keys) // print all keys
    println(MapVar1.values) // print all values

    // Declare Mutable Map Data Type

    import scala.collection.mutable.Map
    val mutable_Var = Map("UST1001" -> "Sandeep", "UST1002" -> "Midhul", "UST1003" -> "Vineesh",
      "UST1004" -> "Adinan")

    // Update
    mutable_Var("UST1001") = "Rohit"
    // Insert new key-value pair
    mutable_Var += ("UST1005" -> "Siva")

    // Iterator in scala programming
    // an iterator in scala represent a sequence of elemnets
    // that allows you to traverse through a collection sequence

    var mylist = List(20,30,40,50,60,70,80,90)

    var iter = mylist.iterator


    //methods of iterator to check if there is more element(.hasNext()) and to remove .remove()

    println(iter.next())

    // Lazy initialisation of variables using scala

    lazy val donuts: Int = 100
    println(donuts * 5)

//    lazy var donuts_1 : Int = 20  **** lazy can't be used with var. *******














  }
}
