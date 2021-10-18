//Developed by: @LucasMarcuzo

using System;

namespace _1759___Ho_Ho_Ho
{
    public class URI {
 
        static void Main(string[] args) {
        
            int N = int.Parse(Console.ReadLine());
            
            for (int i = 0; i < N; i++) 
            {
                if (i < N-1) 
                {
                    Console.Write("Ho ");  
                }
                else
                {
                    Console.WriteLine("Ho!");
                }
            }
        }
    }   
}
