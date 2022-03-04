object MainFun{

  def counting(n:String):Int={
    var count = 0
    var len = n.length()
    for(i <- 0 to len) {
        count = count + 1
    }
    return count
  }

  def count(n:String , c:Char):Int={
   val count = n.count(_ == c)
   return count
  }

 def main(args:Array[String]) = {
    println("Counting :"+counting("Hello"))
    println("Count :"+count("Learn programming" , 'x'))
 }

}  
