object DataStructureMethod{
  def main(args: Array[String]): Unit={

    // ************* List and Methods *********************

    val list_1 = List("Apple","Mango","Orange","Cherry")

    // ****************** Empty List ***********

    val list2 = List()

    // ************* Basic Operations *********************

    val firstname = list_1.head
    val restoflist = list_1.tail
    val lastelement = list_1.last
    val secondelement = list_1(1)

    println(secondelement)

    // ************* Check list or collection is empty *********************

    val islistempty =  list_1.isEmpty
    println(islistempty)

    // ************* Get Length of list *********************

    val length = list_1.length

    // ************* Adding  elements from list *********************

    val list_2 = List(1,2,3,4,5,6,7,8)
    val newlist = 0 :: list_2

    // ************* Append a value at the end *********************

    val appendlist = list_2 :+ 9
    println(appendlist)

    // ************* Concatenation between two list *********************

    val concatlist = list_2 ::: List(9,10,11,12) // ::: is used to concatenate more than 2 values
    val concatlist1 = list_2 ++ List(9,10,11,12) // ++ is used to concatenate more than 2 values

    println(concatlist)
    println(concatlist1)

    // ************* Removing or Dropping elements from list *********************

    val droplist = concatlist.drop(3) // Drop multiple elements from the begining. it take count, how much value want to delete
    println(droplist)

    val removelist1 = concatlist.filter(_ != 3)// remove a specific value. it take a value which want to delete
    println(removelist1)

    val removelist = concatlist.diff(List(3,4,5)) // Deleting a list of values from the exist list.
    println(removelist)

    // ************* Transformin list *********************

    val listmap = list_2.map(_ * 2)  //
    val listmap1 = list_2.filter(_ % 2 == 0) //
    val nestedlist = List(List(1,2,3),List(4,5,6),List(7)) //
    val flatlist = nestedlist.flatMap(identity) // To take single element, reading one element at a time
    println("*** Flat List ***")
    println(flatlist)

    val sum = flatlist.reduce(_ + _) // Adding the list, reading 2 elements at a time and add these 2 values
    println(sum)


    // ************* slicing and subset of  list *********************

    val slist = list_1.take(3) // first 3 element
    val slist1 = list_1.takeRight(3) // last 3 element
    val dlist = list_1.dropRight(3) // without last  2 element
    val sllist = list_1.slice(1,3) // start with 1 end value not include 3

    // ************* Converting list to map *********************

    val listoftuples = List(("UST1001", "Krishan"),("UST1002","Rohit"),("UST1003","Adinan"))
    val map = listoftuples.toMap

    // ************* Zipping list *********************

    val zippedlist = list_1.zip(list_2)
    println(zippedlist)

    val (fruits, numbers) = zippedlist.unzip
    println(fruits)

    // ************* Sets and set methods  *********************

    val set1 = Set(1,2,3,4,5,6,7,8)
    val set2 = Set("Apple","Cherry","Mango","Orange")

    val cset1 = set1.contains(3) // check whether 3 is presnt in the set
    set1 + 9 // adding a value
    set1 - 7 // substract value


    // ************* Set Operations  *********************

    val setA = Set(10,20,30,40)
    val setB = Set(50,60,70,30,40)

    val unionset = setA union setB
    val intersectset = setA intersect  setB
    val differencenset = setA diff setB
    val subsett = setA.subsetOf(setB)

    val nset = Set(("UST1001", "Krishan"),("UST1002","Rohit"),("UST1003","Adinan"))
    val mapset = nset.toMap // Map
    println(mapset)
    setA.foreach(println)// For each
    val filterset = setA.filter(_ %3 ==0)// filter

    // ************* Array  *********************

    val array1 = Array("Kochi","Varkala","Trivandrum","Wayanad")
    val array2 = Array(1,2,3,4,5,6,7,8)

    val emptyarray = Array[Int]() // Empty array declaration
    array2(0) = 10
//   println(array2)

    import scala.collection.mutable.ArrayBuffer

    // Adding elements (Array are fixed size, so we use ArrayBuffer

    val arrayBuffer = ArrayBuffer(1,2,3,4,5,6,7)
    arrayBuffer += 8
    arrayBuffer -= 5
    arrayBuffer.map(_ * 2)
    val array3 = arrayBuffer.toArray

    //Nested Array

    val nestedArray = Array(Array(1,2,3),Array(4,5,6),Array(8,9))
    val flatarray = nestedArray.flatten

    // slicing an array

     flatarray.slice(1,5)
    val array4 = Array(30,40,10,80,60,20,50)
    val sorted = array4.sorted
    sorted.foreach(println)

//    sorted.reverse.foreach()

    // ************* Group by() method in Scala Collection  *********************

    var array6 = Array("Kochi","Varkala","Trivandrum","Wayanad","Kannur","Calicut","Kasargod")
    val groupbylen = array6.groupBy(_.length)
    val groupbyFirstchar = array6.groupBy(_.charAt(0))
    val groupoddeven = array4.groupBy(num => if(num % 2 == 0) "even" else "odd")
    groupoddeven.foreach {
      case (key, value) => println(s"$key: ${value.mkString(", ")}")
    }


    for((key,num) <- groupoddeven){
      println(key)
      num.foreach(println)
    }


    // ************* Collection Map *********************

    val immutableMap = Map("a" ->1, "b" ->2, "c" -> 3, "d" -> 4, "e" ->5)
    import scala.collection.mutable
    val mutableMap = mutable.Map("a" ->1, "b" ->2, "c" -> 3, "d" -> 4, "e" ->5)
    immutableMap.contains("a")
    println(immutableMap("a")) // print output stored in key

    val mapA = Map("a" -> 1,"b"->2 ,"c" -> 3)// concatenate two maps
    val mapB = Map("b" ->4,"e" ->5,"f"->6,"g"-> 7)
    val mergedbMap = mapA ++ mapB
    println(mergedbMap)



    // ************* Transforming Keys and values  *********************

    val incrementValue = immutableMap.mapValues(_ + 1)
    val transformkey = immutableMap.map{case(k,v) => (k.toUpperCase, v)}

    transformkey.foreach{
      case(key,value) => println(s"$key -> $value")
    }

    // ************* Transforming Keys and values  *********************
    // ************* Transforming Keys and values  *********************


  }
}
