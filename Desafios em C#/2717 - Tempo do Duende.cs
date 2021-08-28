using System;

namespace _2717___Tempo_do_Duende
{
    class URI {
    
        public static void Main (string[] args) {
        
            int finalExpediente = int.Parse(Console.ReadLine());
            
            string[] linha_min = Console.ReadLine().Split(' ');
            
            int presente1 = int.Parse(linha_min[0]);
            int presente2 = int.Parse(linha_min[1]);
            
            int total =  presente1 + presente2;
            
            if (total > finalExpediente)
            {
            Console.WriteLine("Deixa para amanha!");
            }
            else
            {
            Console.WriteLine("Farei hoje!");
            }
        }
    }
}
