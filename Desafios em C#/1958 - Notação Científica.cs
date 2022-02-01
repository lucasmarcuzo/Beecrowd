using System;

//Developed by: @LucasMarcuzo

public class Main1958 {
 
    public static void Main(string[] args) {

       string x = Console.ReadLine();

       if(x.Equals("-0")){
           Console.WriteLine("{0:-0.0000E+00}", Double.Parse(x));
       }else if(x.StartsWith("-") && Double.Parse(x) <= 0){
           Console.WriteLine("{0:0.0000E+00}", Double.Parse(x));
       }else{
           Console.WriteLine("{0:+0.0000E+00}", Double.Parse(x));
       }
    }
}