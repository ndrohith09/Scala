object MainFun{
 
  def fibonacci(n:Int):Int={
    if(n==0) {
        return 0
    }
    else if(n==1) {
        return 1
    }
    else {
        return fibonacci(n-1) + fibonacci(n-2)
    }
}

  def main(args:Array[String]) = { 
 
   println("Fibonacci :" + fibonacci(10))
 }

}  
