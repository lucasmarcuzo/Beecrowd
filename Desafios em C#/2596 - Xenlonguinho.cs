using System; 

//Developed by: @LucasMarcuzo

class URI {

    static void Main(string[] args) { 

        int x = int.Parse(Console.ReadLine());
  
         for (int i = 0; i < x; i++)
         {
             ulong n = ulong.Parse(Console.ReadLine());
  
             Console.WriteLine("{0}",  (ulong)(n - (Math.Floor(Math.Sqrt(n)))));
         }
    }

}