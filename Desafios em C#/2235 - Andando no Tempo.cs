using System;

//Developed by: @LucasMarcuzo

namespace _2235___Andando_no_Tempo
{
    class Program
    {
        static void Main(string[] args)
        {
            string[] l = Console.ReadLine().Split(' ');

            int a = int.Parse(l[0]);
            int b = int.Parse(l[1]);
            int c = int.Parse(l[2]);

            if (a + b == c || a + c == b || b + c == a || a == b || b == c ||  a == c)  
            {
                Console.WriteLine("S");
            }
            else {
                Console.WriteLine("N");
            }
        }
    }
}
