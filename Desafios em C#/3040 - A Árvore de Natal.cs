using System;

//Developed by: @LucasMarcuzo

namespace _3040___A_Árvore_de_Natal
{
    class Program
    {
        static void Main(string[] args)
        {

            int ts = int.Parse(Console.ReadLine());

            for (int i = 0; i < ts; i++)
            {
                string[] v = Console.ReadLine().Split();

                int altura = int.Parse(v[0]);
                int diametro = int.Parse(v[1]);
                int galhos = int.Parse(v[2]);

                if(altura >= 200 && altura <= 300)
                {
                    if (diametro >= 50)
                    {
                        if(galhos > 150)
                        {
                            Console.WriteLine("Sim");
                        }
                        else
                        {
                            Console.WriteLine("Nao");
                        }
                    }
                    else
                    {
                        Console.WriteLine("Nao");
                    }
                }
                else
                {
                    Console.WriteLine("Nao");
                }
            }
        }
    }
}
