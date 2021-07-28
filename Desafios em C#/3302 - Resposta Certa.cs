using System;

//Developed by: @LucasMarcuzo

namespace _3302___Resposta_Certa
{
    class Program
    {
        static void Main(string[] args)
        {
            int j = 1;
            int x = int.Parse(Console.ReadLine());

            int[] vet = new int[x];

            for (var i = 0; i < vet.Length; i++)
            {
                vet[i]=int.Parse(Console.ReadLine());
            }

            foreach (var vl in vet)
            {
                Console.WriteLine("resposta {0}: {1}",j,vl);
                j++;
            }

        }
    }
}
