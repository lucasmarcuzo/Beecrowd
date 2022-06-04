//Developed by: @LucasMarcuzo

using System; 

class URI {

    static void Main(string[] args) { 

       int T, menor = 21, posMenor = 0;

        int N = int.Parse(Console.ReadLine());
        string[] value = Console.ReadLine().Split(' ');

        for (int i = 0; i < value.Length; i++) {
            
            T = int.Parse(value[i]);

            if (menor > T) 
            {
                menor = T;
                posMenor = i + 1;
            } 

        }
        
        Console.WriteLine(posMenor);

    }

}