using System;

//Developed by: @LucasMarcuzo

namespace _1985___MacPRONALTS
{
    class Program
    {
        static void Main(string[] args)
        {
            int n, cod, qtd;
            double result=0f;
            n=int.Parse(Console.ReadLine());

            int[] vet_cod = {1001, 1002, 1003, 1004, 1005};
            double[] vet_val = {1.50f, 2.50f, 3.50f, 4.50f, 5.50f};

            for (int i = 0; i < n; i++)
            {
                string[] l = Console.ReadLine().Split(' ');

                cod=int.Parse(l[0]);
                qtd=int.Parse(l[1]);

                for (int j = 0; j < vet_val.Length; j++)
                {
                    if(cod == vet_cod[j])
                    {
                        result+=vet_val[j]*qtd;
                    }
                    
                }  

            }

                 Console.WriteLine(result.ToString("F2"));
        }
    }
}
