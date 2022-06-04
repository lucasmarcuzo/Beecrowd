//Developed by: @LucasMarcuzo

using System; 
using System.Collections.Generic;

class URI 
{
    static void Main(string[] args) 
    { 
        List<int> numerosImpares = new List<int>();
        List<int> numerosPares = new List<int>();

        int N = int.Parse(Console.ReadLine());

        for (int i = 0; i < N; i++) 
        {
            int numero = int.Parse(Console.ReadLine());
            if(numero % 2 == 0)
            {
                numerosPares.Add(numero);
            }
            else
            {
                numerosImpares.Add(numero);
            }
        }

        numerosPares.Sort();
        numerosImpares.Sort();
        numerosImpares.Reverse();

        foreach (int i in numerosPares) 
        {
            Console.WriteLine(i);
        }
        
        foreach (int i in numerosImpares) 
        {
            Console.WriteLine(i);
        }
    
    }

}