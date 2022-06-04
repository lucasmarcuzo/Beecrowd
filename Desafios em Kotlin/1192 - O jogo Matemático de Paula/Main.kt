//Developed by: @LucasMarcuzo

import java.io.IOException;
 
fun main(args: Array<String>) {
    
    val N = readLine()!!.toInt()
    for (i in 1..N) {
      var str = readLine()!!
      var N1 : Int = str.substring(0, 1).toInt()
      var N2 : Int = str.substring(2).toInt()
      var x : String = str.substring(1, 2)
        
      if (N1.equals(N2)) 
      {
        println(N1 * N2)
      } 
      else 
      {
        if (x.toUpperCase()==x) 
        {
          println(N2 - N1)
        } 
        else 
        {
          println(N1 + N2)
        }
      }
   }
}