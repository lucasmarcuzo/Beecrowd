using System;

//Developed by: @LucasMarcuzo

namespace _1149___Somando_Inteiros_Consecutivos
{
    class Program
    {
        static void Main(string[] args)
        {
            int a, n=0, i=1, x=0;

            string[] l = Console.ReadLine().Split(' ');

            a = int.Parse(l[0]);
            n = int.Parse(l[1]);
            
            
             while (n<=0)
            {
                i = i + 1; 
                n = int.Parse(l[i]);
            }
            
            
            for(int j = 0; j < n; j++) 
            {
                x=x+a+j;
            }

            Console.WriteLine(x);

        }
    }
}
