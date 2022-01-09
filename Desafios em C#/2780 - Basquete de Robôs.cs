using System;

//Developed by: @LucasMarcuzo

namespace _2780___Basquete_de_Robôs
{
    class Program
    {
        static void Main(string[] args)
        {
            int jogada = int.Parse(Console.ReadLine());

            if(jogada <= 800){
                Console.WriteLine("1");
            }else if(jogada > 800 && jogada <= 1400){
                Console.WriteLine("2");
            }else if(jogada > 1400 && jogada <= 2000){
                Console.WriteLine("3");
            }
        }
    }
}
