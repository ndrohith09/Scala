object MainFun{
 def max(x:Int,y:Int):Int={
     if(x>y) { 
        x
      }
       else{ 
        y
       } 
 }
 

 def main(args:Array[String]) = {
   println("Max Number is :"+max(10,20)) 
 }

}  
