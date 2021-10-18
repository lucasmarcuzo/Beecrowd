//Developed by: @LucasMarcuzo

using System;

namespace _1921___Guilherme_e_Suas_Pipas
{
    class Program
    {
        static void Main(string[] args)
        {
            long N = long.Parse(Console.ReadLine());

            long total = (( N * N ) - ( 3 * N )) / 2;  

            Console.WriteLine(total);

        }
    }
}
