using System;
using System.Collections.Generic;

//Developed by: @LucasMarcuzo

class ChurrasNoYuri
{
    static void Main(string[] args)
    {
        SortedDictionary<int, string> carnes = new SortedDictionary<int, string>();
        string input;

        while (!string.IsNullOrEmpty(input = Console.ReadLine()))
        {
            int numPecasCarne = int.Parse(input);

            for (int i = 0; i < numPecasCarne; i++)
            {
                string[] l = Console.ReadLine().Split(' ');

                var nomeCarne = l[0];
                var dataValidade = int.Parse(l[1]);

                carnes.Add(dataValidade, nomeCarne);
            }

            Console.WriteLine(string.Join(" ", carnes.Values));
            carnes.Clear();
        }
    }
}

