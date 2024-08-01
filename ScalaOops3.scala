import org.w3c.dom.DOMImplementation
// Class with companion object using scala

//Companion objects can be used to provide factory method and utility functions related to a class.

// A companion object will have same name as of class trail same scope it resides within same file;
// Access to private members of class or traits;
//this can accessed directly using class name without any instance of class.


class Circle(val radius:Double){
  def area: Double=Math.PI * radius *radius
  def circumference: Double = 2*Math.PI*radius
}

object circle{
  def apply(radius:Double):Circle = new Circle(radius)
}

object CompanionObj extends App{

  //create an instance using companion object

  var circle = Circle(6.0)
  println(s"Area of circle ${circle.area}")
  println(s"Circumference of circle ${circle.circumference}")
}
