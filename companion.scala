import scala.math.{Pi, pow}

class Circle() {
 def calculateArea(radius: Double): Double = Pi * pow(radius, 2.0)
}
object Circle {
 def main(args:Array[String])={
  val a= new Circle().calculateArea(5.0)
  println("Area of circle is: "+a)
 }
}