using System;

//Developed by: @LucasMarcuzo

namespace _2787___Xadrez
{
    class Program
    {
        static void Main(string[] args)
        {
            int x = int.Parse(Console.ReadLine());
            int y = int.Parse(Console.ReadLine());

            int[,] xadrez = new int[x,y];

            for (int i = 0; i < x; i++)
            {
                for (int j = 0; j < y; j++)
                {
                    int o = i + j;
                    if (o % 2 == 0)
                    {
                        xadrez[i,j] = 1;
                    }
                    else
                    {
                        xadrez[i,j] = 0;
                    }

                }

            }

 
            int v = Convert.ToInt32(xadrez.GetValue(x-1,y-1));

            Console.WriteLine("{0}", v);

        }
    }
}
