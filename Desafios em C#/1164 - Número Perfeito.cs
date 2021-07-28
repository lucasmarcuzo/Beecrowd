using System;

//Developed by: @LucasMarcuzo

namespace _1164___Número_Perfeito
{
    class Program
    {
        static void Main(string[] args)
        {
            int x = int.Parse(Console.ReadLine());

            for (int i = 0; i < x; i++)
            {
                int valor = 0, total = 0;

                valor = int.Parse(Console.ReadLine());

                for (int j = 1; j < valor; j++)
                {
                    if (valor % j == 0)
                    {
                        total += j;
                    }     
                }

                if(valor == total)
                {
                    Console.WriteLine("{0} eh perfeito",valor);
                }
                else
                {
                    Console.WriteLine("{0} nao eh perfeito",valor);
                }



            }








        }
    }
}
