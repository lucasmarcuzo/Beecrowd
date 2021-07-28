using System;

//Developed by: @LucasMarcuzo

namespace _1155___Sequência_S
{
    class Program
    {
        static void Main(string[] args)
        {

            double s = 1;

            for (int i = 2; i <= 100; i++)
            {
                s += (double)1/i;
            }

            Console.WriteLine("{0:f}", s);





        }
    }
}
