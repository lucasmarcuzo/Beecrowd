using System;

//Developed by: @LucasMarcuzo

namespace _1957___Converter_para_Hexadecimal
{
    class Program
    {
        static void Main(string[] args)
        {
            int x = int.Parse(Console.ReadLine());

            String y = x.ToString("X");

            Console.WriteLine(y.ToUpper());
                
        }
    }
}
