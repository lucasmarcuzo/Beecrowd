//Developed by: @LucasMarcuzo

using System;

namespace _1959___Polígonos_Regulares_Simples
{
    class Program
    {
        static void Main(string[] args)
        {
            string[] v = Console.ReadLine().Split();

            long N = long.Parse(v[0]);
            long L = long.Parse(v[1]);

            long total = N * L;

            Console.WriteLine(total);


        }
    }
}
