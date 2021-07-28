using System;

//Developed by: @LucasMarcuzo

namespace _3303___Palavrão
{
    class Program
    {
        static void Main(string[] args)
        {
            string palavra = Console.ReadLine().ToLower();

            if(palavra.Length <= 20)
            {
                if(palavra.Length >= 10)
                {
                    Console.WriteLine("palavrao");
                }
                else
                {
                    Console.WriteLine("palavrinha");
                }
            }
        }
    }
}
