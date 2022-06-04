//Developed by: @LucasMarcuzo

import java.util.Scanner

fun main(args: Array<String>) {
  var reader = Scanner(System.`in`)

  var a = reader.nextDouble()
  var b = reader.nextDouble()
    
  var weightA = 3.5
  var weightB = 7.5
  var totalWeight = weightA + weightB
    
  var m = (a * weightA + b * weightB) / totalWeight

  var r = "%.5f".format(m)
    
  println("MEDIA = ${r}")
}