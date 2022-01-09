using System;

//Developed by: @LucasMarcuzo

namespace _2757___Entrada_e_Saída_de_Números_inteiros
{
    class Program
    {
        static void Main(string[] args)
        {
            int tamA, tamB, tamC;
            tamA = tamB = tamC = 0;
            int A = Convert.ToInt32(Console.ReadLine());
            int B = Convert.ToInt32(Console.ReadLine());
            int C = Convert.ToInt32(Console.ReadLine());

            if(A < 0){
                tamA = 9 - A.ToString().Length;
            }
            else{
                tamA = 10 - A.ToString().Length;
            }

            if(B < 0){
                tamB = 9 - B.ToString().Length;
            }
            else{
                tamB = 10 - B.ToString().Length;
            }

            if(C < 0){
                tamC = 9 - C.ToString().Length;
            }
            else{
                tamC = 10 - C.ToString().Length;
            }
            
            Console.Write("A = {0}, B = {1}, C = {2}\n", A , B, C);
            Console.Write("A = {0}, B = {1}, C = {2}\n", A.ToString().PadLeft(10), B.ToString().PadLeft(10), C.ToString().PadLeft(10));
            Console.Write("A = {0}, B = {1}, C = {2}\n", A.ToString("D" + (A.ToString().Length+tamA)), B.ToString("D" + (B.ToString().Length+tamB)), C.ToString("D" + (C.ToString().Length+tamC)));
            Console.Write("A = {0}, B = {1}, C = {2}\n", A.ToString().PadRight(10), B.ToString().PadRight(10), C.ToString().PadRight(10));
            
        }

        
    }
}
