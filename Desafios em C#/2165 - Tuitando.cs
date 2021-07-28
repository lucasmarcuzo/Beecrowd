using System;

//Developed by: @LucasMarcuzo

namespace _2165___Tuitando
{
    class Program
    {
        static void Main(string[] args)
        { 
            String s = Console.ReadLine();

            int x = s.Length;

            if(x <= 140)
            {
                Console.WriteLine("TWEET");
            }
            else
            {
                Console.WriteLine("MUTE");
            }
        }
    }
}
