using System;

//Developed by: @LucasMarcuzo

namespace _2779___Álbum_da_Copa
{
    class Program
    {
        static void Main(string[] args)
        {
            int num_album = 0, fig_compradas = 0;

            num_album = int.Parse(Console.ReadLine());

            fig_compradas = int.Parse(Console.ReadLine());

            int[] figurinhas = new int[fig_compradas];

            for (int i = 0; i < figurinhas.Length; i++)
            {
                bool y = false;
                int id = int.Parse(Console.ReadLine());

                foreach (int x in figurinhas)
                {
                    if (x == id)
                    {
                        y = true;
                        break;
                    }
                }   

                if(y == false)
                {
                    figurinhas[i]=id;
                    num_album--;
                }         
            
                 
            }

            Console.WriteLine(num_album);  

            
        }
    }
}
