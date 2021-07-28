using System;

//Developed by: @LucasMarcuzo

namespace _1190___Área_Direita
{
    class Program
    {
        static void Main(string[] args)
        {
            float[,] x = new float[12,12];
            char tipo;

            tipo = char.Parse(Console.ReadLine().ToUpper());

            for (int i = 0; i < 12; i++)
                {
                    for (int j = 0; j < 12; j++)
                    {
                        x[i,j] = Convert.ToSingle(Console.ReadLine());
                    }
                }
                float total = 0;

                for (int i = 5; i < 7; i++)
                {      
                    total += x[i,7];     
                }

                for (int j = 4; j < 8; j++)
                {      
                    total += x[j,8];     
                }

                for (int k = 3; k < 9; k++)
                {      
                    total += x[k,9];     
                }

                for (int l = 2; l < 10; l++)
                {      
                    total += x[l,10];     
                }

                for (int m = 1; m < 11; m++)
                {      
                    total += x[m,11];     
                }

            if (tipo == 'S')
            {
                Console.WriteLine("{0:F1}",total);
            }
            else if (tipo == 'M')
            {
                Console.WriteLine("{0:F1}",total/30.0f);
            }   
        }
    }
}
