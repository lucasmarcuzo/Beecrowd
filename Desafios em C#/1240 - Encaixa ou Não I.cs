using System;

//Developed by: @LucasMarcuzo

namespace _1240___Encaixa_ou_Não_I
{
    class Program
    {
        static void Main(string[] args)
        {   
            
            int casos = int.Parse(Console.ReadLine());

            for (int i = 0; i < casos; i++)
            {               
                string[] linha = Console.ReadLine().Split(' ');

                string primeiro = linha[0];
                string segundo = linha[1];
                
                int tam_primeiro = primeiro.Length;
                int tam_segundo = segundo.Length;

                int tam = tam_primeiro - tam_segundo;

                if (tam_primeiro < tam_segundo)
                {
                    Console.WriteLine("nao encaixa");
                }
                else
                {
                    string y = primeiro.Substring(tam, tam_segundo); 
                    bool x = y.Contains(segundo); 

                    if(x == true)
                    {
                        Console.WriteLine("encaixa"); 
                    }
                    else
                    {
                        Console.WriteLine("nao encaixa"); 
                    }                      
                }
            }
        }
    }
}
