import scala.collection.immutable.HashSet
object MainObject{  

def sets = {  
        val hs: HashSet[String] = HashSet("Boeing", "Airbus" , "Bombardier")
        println(s"Elements are = $hs")
           
        val hs1: HashSet[String] = hs ++ HashSet[String]("Java", "Scala")
        println(s"Add more than one HashSets = $hs1")

}  
 def main(args:Array[String]) = {
sets  
 } 
}
