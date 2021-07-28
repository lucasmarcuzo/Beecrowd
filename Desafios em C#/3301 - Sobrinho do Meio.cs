using System;

//Developed by: @LucasMarcuzo

namespace _3301___Sobrinho_do_Meio
{
    class Program
    {
        static void Main(string[] args)
        {
            int H, Z, L;

            string[] array = Console.ReadLine().Split(' ');

            H=int.Parse(array[0]);
            Z=int.Parse(array[1]);
            L=int.Parse(array[2]);

            if(H > Z && H < L || H < Z && H > L)
            {
                Console.WriteLine("huguinho");
            }
            else if(H < Z && Z < L || H > Z && L < Z )
            {
                Console.WriteLine("zezinho");
            }
            else if (H > Z && L > Z || H < Z && H < L)
            {
                Console.WriteLine("luisinho");
            }      
        }
    }
}
