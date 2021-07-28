using System;

//Developed by: @LucasMarcuzo

namespace _1159___Soma_de_Pares_Consecutivos
{
    class Program
    {
        static void Main(string[] args)
        {
            do
            {
                int num = 0, i = 0, v = 0;

                num=Convert.ToInt32(Console.ReadLine());

                if(num == 0)
                {
                    break;
                }
                else
                {
                    do
                    {
                        if(num % 2 == 0)
                        {
                            i+=num;
                            v++;
                        }
                        num++;
                        

                    } while (v < 5);

                    Console.WriteLine("{0}",i);

                }
                
            } while (true);

        }
    }
}
