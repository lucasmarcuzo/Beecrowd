//Developed by: @LucasMarcuzo

using System; 

class URI 
{
    static void Main(string[] args) 
    { 
    
        int N = int.Parse(Console.ReadLine());
    
        for (int i=0 ; i<N ; i++) 
        {
            string[] entrada = Console.ReadLine().Split(' ');
            char[] fr1 = entrada[0].ToCharArray();
            char[] fr2 = entrada[1].ToCharArray();
            string saida = "";
            
            for (int z = 0; z < (fr1.Length + fr2.Length); z++) 
            {
                if (z < fr1.Length)
                    saida+=fr1[z];
                if (z < fr2.Length)
                    saida+=fr2[z];
            }

            Console.WriteLine(saida);
        }		
    
    }
}