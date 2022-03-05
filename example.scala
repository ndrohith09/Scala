 
object MainObject{  

def scalaExample = {  
    val s = new String("Hello Scala")
    println(s) 
    val greetStrings = new Array[String](3)
    greetStrings(0) = "Hello"
    greetStrings(1) = ", "
    greetStrings(2) = "world!\n"
    for (i <- 0 to 2)
      print(greetStrings(i))
}  
 def main(args:Array[String]) = {
scalaExample  
 } 
}
