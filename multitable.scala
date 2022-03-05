object MainObject{  


 def printMultiTable() = {
     for(i <- 1 to 10) {
         for(j <- 1 to 10) {
             val prod = (i * j).toString
             var k = prod.length
             while(k < 3) {
                 print(" ")
                 k += 1
             }
             print(prod)
         }
         println()
     }
 }

 def main(args:Array[String]) = {
  printMultiTable()
 } 
}