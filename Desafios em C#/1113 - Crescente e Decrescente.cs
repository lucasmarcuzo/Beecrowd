using System; 

//Developed by: @LucasMarcuzo
class URI1113 {
    static void Main(string[] args) { 

        int x, y;

        do
        {
            string[] s = Console.ReadLine().Split(' ');

            x = int.Parse(s[0]);
            y = int.Parse(s[1]);

            if(x > y){

                Console.WriteLine("Decrescente");

            }else if(x < y){

                Console.WriteLine("Crescente");
            }
            
        } while (x != y);
    }
}

