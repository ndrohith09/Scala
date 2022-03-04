object MainFun{
 
 def oddeven(x:Int):Boolean={
 
     if( x % 2 == 0) {
        print("odd:")
        return true
     }
     else {
        print("even:")
         return false
     }
 }
 
 def main(args:Array[String]) = { 
   println("Odd Even  :")
   println(oddeven(20)) 
 }

}  
