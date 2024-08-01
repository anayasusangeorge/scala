
// Case classes are special classes in Scala programming that are immutable and are compared by value.
// They are ideal ao use in pattern matching


case class  Person(name: String,salary:Int)
  object CaseClass extends App{

    // create an instance of case class

    val person1 = Person("Anu",30000)
    val person2 = Person("Naveen",50000)

    // Print the persons Details

    println(person1)
    println(person2)

    //copy case class

    val person3 = person1.copy(salary = 25000)
    println(person3)

    //Pattern Matching
    //In scala it allows to match values against pattern and execute code based on the match.
    // It is similar to switch

    person1 match{
      // case pattern1 => result1
      // case pattern2 => result2
      // case_ => default

      case Person(name,salary) => println(s"Name : $name, Salary : $salary")
    }

}
