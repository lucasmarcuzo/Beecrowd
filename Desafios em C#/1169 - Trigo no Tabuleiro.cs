using System;
using System.Globalization;

//Developed by: @LucasMarcuzo

namespace _1169___Trigo_no_Tabuleiro
{
    class Program
    {
        static void Main(string[] args)
        {
            int n, i;
            double x;
                
            n = int.Parse(Console.ReadLine());

            for(i = 0; i < n; i++){

                x = Convert.ToDouble(Console.ReadLine(), CultureInfo.InvariantCulture);

                Console.WriteLine("{0} kg", Convert.ToUInt64(Math.Floor(Math.Pow(2,x)/12000)));
            }
        }
    }
}
