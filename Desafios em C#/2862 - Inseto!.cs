using System;

//Developed by: @LucasMarcuzo

namespace _2862___Inseto_
{
    class Program
    {
        static void Main(string[] args)
        {
            int c = int.Parse(Console.ReadLine());

            for (var i = 0; i < c; i++)
            {
                int x = int.Parse(Console.ReadLine());

                if(x > 8000)
                {
                    Console.WriteLine("Mais de 8000!");
                }
                else
                {
                    Console.WriteLine("Inseto!");
                }

            }
        }
    }
}
