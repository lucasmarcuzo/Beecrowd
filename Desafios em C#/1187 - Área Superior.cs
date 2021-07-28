using System;
using System.Globalization;

//Developed by: @LucasMarcuzo

namespace _1187___Área_Superior
{
    class Program
    {
        static void Main(string[] args)
        {
            double[,] x = new double[12,12];
            char tipo;

            tipo = char.Parse(Console.ReadLine().ToUpper());

            for (int i = 0; i < 12; i++)
            {
                for (int j = 0; j < 12; j++)
                {
                    x[i,j] = Convert.ToDouble(Console.ReadLine(), CultureInfo.InvariantCulture);
                }
            }

            double total = 0;

            for (int i = 5; i < 7; i++)
            {      
                total += x[4,i];     
            }

            for (int j = 4; j < 8; j++)
            {      
                total += x[3,j];     
            }

            for (int k = 3; k < 9; k++)
            {      
                total += x[2,k];     
            }

            for (int l = 2; l < 10; l++)
            {      
                total += x[1,l];     
            }

            for (int m = 1; m < 11; m++)
            {      
                total += x[0,m];     
            }

            if (tipo == 'S')
            {
                Console.WriteLine("{0:F1}", total);
            }
            else if (tipo == 'M')
            {
                total = total/30.0f;
                Console.WriteLine("{0:F1}", total);
               
            }   
        }
    }
}
