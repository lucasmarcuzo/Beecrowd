using System;

//Developed by: @LucasMarcuzo

namespace _2006___Identificando_o_Chá
{
    class Program
    {
        static void Main(string[] args)
        {
            int x, y;
            x=y=0;

            x=int.Parse(Console.ReadLine());

            int[] vet = new int[5];

            string[] l = Console.ReadLine().Split(' ');

            vet[0]=int.Parse(l[0]);
            vet[1]=int.Parse(l[1]);
            vet[2]=int.Parse(l[2]);
            vet[3]=int.Parse(l[3]);
            vet[4]=int.Parse(l[4]);

            for (int i = 0; i <vet.Length; i++)
            {
                if(x == vet[i])
                {
                    y++;
                }
            }

            Console.WriteLine(y);
            
        }
    }
}
