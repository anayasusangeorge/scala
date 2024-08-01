// Inheritance - Example demonstrates inheritance, where a subclass extends a superclass(Parent class)


class Animal(var name: String){
  def makeSound(): Unit={
    println(s"$name is making a sound")
  }
}

// subclass

class Dog(name:String) extends Animal(name){
  override def makeSound(): Unit = {
    println(s"$name says Woof!")
  } 
}

object Inheritobj extends App{
  val animal = new Animal("Charlie")
  animal.makeSound()
  val dog = new Dog("Naveen")
  dog.makeSound()
}

