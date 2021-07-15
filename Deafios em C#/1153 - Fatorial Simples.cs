using System;

//Developed by: @LucasMarcuzo

namespace _1153___Fatorial_Simples
{
    class Program
    {
        static void Main(string[] args)
        {

            int n, f, x; 
            x=f=1;

            n=int.Parse(Console.ReadLine());

            while (x <= n)
            {
                f=f*x;
                x++;
            }
    
            Console.WriteLine(f); 
        }
    }
}
