object Prime{
    def prime(n:Int):Boolean = {
        if(n == 1) return false
        if(n == 2) return true
        if(n % 2 == 0) return false
        for(i <- 3 to Math.sqrt(n).toInt by 2){
            if(n % i == 0) return false
        }
        return true
    }
}