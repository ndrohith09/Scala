import scala.collection.mutable.HashSet 
object MainObject{  

def sets = {  
    val jetSet = new HashSet[String]
    jetSet += "Boeing"
    jetSet += "Airbus"
    jetSet += ("Bombardier" , "Airbus")
    println(jetSet)
    println(jetSet.contains("Cessna"))

}  
 def main(args:Array[String]) = {
sets  
 } 
}
