using System;

//Developed by: @LucasMarcuzo

namespace _1188___Área_Inferior
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
                total += x[7,i];     
            }

            for (int j = 4; j < 8; j++)
            {      
                total += x[8,j];     
            }

            for (int k = 3; k < 9; k++)
            {      
                total += x[9,k];     
            }

            for (int l = 2; l < 10; l++)
            {      
                total += x[10,l];     
            }

            for (int m = 1; m < 11; m++)
            {      
                total += x[11,m];     
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
