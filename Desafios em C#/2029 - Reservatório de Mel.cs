//Developed by: @LucasMarcuzo

using System;

namespace _2029___Reservatório_de_Mel
{
    class Program
    {
        static void Main(string[] args)
        {                    
            decimal V, D, R, area, altura;
            
            while (true) {

                string aux = Console.ReadLine();

                if(string.IsNullOrEmpty(aux))
                {
                    break;
                }
                else
                {
                    V = decimal.Parse(aux);
                    D = decimal.Parse(Console.ReadLine());
                    R = D / 2;
                    area = ((3.14m * R) * R);
                    altura = V / area;
                    
                    Console.WriteLine("ALTURA = " + altura.ToString("F2"));
                    Console.WriteLine("AREA = " + decimal.Round(area, 2, MidpointRounding.ToEven));

                }
            
                
            }
        }
    }
}
