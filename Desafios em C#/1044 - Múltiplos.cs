using System; 

//Developed by: @LucasMarcuzo
class URI1044 {

    static void Main(string[] args) { 

        int x, y;

        string[] linha = Console.ReadLine().Split(' ');

        x = int.Parse(linha[0]);
        y = int.Parse(linha[1]);

        if(y % x == 0 || x % y == 0){
            
            Console.WriteLine("Sao Multiplos");
            
        }else if((y % x) > 0){

            Console.WriteLine("Nao sao Multiplos");
        }
    }
}