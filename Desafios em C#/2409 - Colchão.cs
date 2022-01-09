using System;

//Developed by: @LucasMarcuzo

namespace _2409_Colchao
{
    class Program
    {
        static void Main(string[] args)
        {
            string[] l = Console.ReadLine().Split(' ');

            int A = int.Parse(l[0]);
            int B = int.Parse(l[1]);
            int C = int.Parse(l[2]);

            string[] l1 = Console.ReadLine().Split(' ');
            
            int H = int.Parse(l1[0]);
            int L = int.Parse(l1[1]);
            
            if (A <= H && B <= L){
            Console.WriteLine("S");
            } 
            else if (A <= H && C <= L){
            Console.WriteLine("S");
            } 
            else if (B <= H && A <= L){
            Console.WriteLine("S");
            } 
            else if (B <= H && C <= L){
            Console.WriteLine("S");
            } 
            else if (C <= H && A <= L){
            Console.WriteLine("S");
            } 
            else if (C <= H && B <= L){
            Console.WriteLine("S");
            } 
            else {
            Console.WriteLine("N");
            }
        }
    }
}
