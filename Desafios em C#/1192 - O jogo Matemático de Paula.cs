//Developed by: @LucasMarcuzo

using System; 

class URI {

    static void Main(string[] args) { 

        int N = int.Parse(Console.ReadLine());
        for (int i = 0; i < N; i++) 
        {
        
            string valor = Console.ReadLine();
            int N1 = int.Parse(valor.Substring(0, 1));
            int N2 = int.Parse(valor.Substring(2));
            Char x = char.Parse(valor.Substring(1, 1));
            
            if (N1.Equals(N2)) 
            {
                Console.WriteLine(N1 * N2);
            } 
            else 
            {
                if (Char.IsUpper(x))
                {
                    Console.WriteLine(N2 - N1);
                } 
                else 
                {
                    Console.WriteLine(N2 + N1);
                }
            }
        }
   }    
}