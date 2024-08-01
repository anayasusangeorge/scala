object workflow{
  def main(args: Array[String]): Unit={

    // 1. Map function
    // Map function transforms each elemenet of collection using given function

    val numbers = List(11,21,3,4,5,6,7,8)
    val doublenum = numbers.map(_*2) // all single value is multiple by 2
    val stringnum = numbers.map(_+"number")
    stringnum.foreach(println)
    val words = List("Anu","Manu","Chinnu","Ponnu")
    println(words.map(_.length)) // it give the length of a single word in an array

    // 2. Flat Map
    // Flat Map used for transforming a multi dimensional collection into a single collection

    val nestedList = List(List(1,2,3),List(4,5,6),List(7,8))
    val finalnested = nestedList.flatMap(identity)
    finalnested.foreach(println)

    val sentence = List("Hello scala you are awesome","Scala is fuuny")
    val finalsent = sentence.flatMap(_.split(" "))
    finalsent.foreach(println)

    // 3.Filter
    // It select elements from collection that satisfy a given condition

    val shortwords = finalsent.filter(_.length <= 4) // it takes the words only have the length 4
    println(shortwords)

    // 4. Fold:
    // This combines elements of collection using a binary operation starting with a initial value.

    val foldn = numbers.fold(1)(_ + _)// Will get the sum of all values in number it add with 1.
    println(foldn)

    // 5. Reduce
    // It combines the elements of collection, but does not require any initial position.

    val words2 = List("UST","is","best")
    val combinatn = words2.reduce(_+ " "+_)
    println(combinatn)

    //6. Foreach
    // Function that apply a given procedure to each element of a collection

    words.foreach(word => println(word.toUpperCase))

    // 7.collect
    // The collect function applies a partial function to the elements
    // of collection and returning a new collection.

    val number1 = List(1,2,3,4,5,6,7,8,9,10)
    val oddnum = number1.collect { case x if x % 2 != 0 => x}
    println(oddnum)

    // words of length >=5

    val largeword = words.collect{case x if x.length  >=5 => x}
    println(largeword)

    // 8. Partition
    // This function will split collection into two part based on predicate(condition)

    val (longword, shortword) = words.partition(_.length > 4)
    println(longword)
    println(shortword)

    // 9. GroupBy
    // The groupBy function groups a collection based on a given function

    val num = List(11,12,13,14,15,16,17,18,19)
    val resultg = num.groupBy(_%2 == 0)
    println(resultg)

    // 10.scan
    // It is similar to fold, but it returns a collection of successive cumulative
    // results of binary operation

    val cnum = num.scan(1)(_+_)
    println(cnum)
    
    







  }
}
