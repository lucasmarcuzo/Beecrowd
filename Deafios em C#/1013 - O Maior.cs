using System; 

//Developed by: @LucasMarcuzo
class URI1013 {

    static void Main(string[] args) { 

            int MaiorAB,MaiorABC;

            String linha = Console.ReadLine();
            string[] v = linha.Split(' ');
            
            
            int a = int.Parse(v[0]);
            int b = int.Parse(v[1]);
            int c = int.Parse(v[2]);

            MaiorAB = (a + b + Math.Abs(a - b )) / 2;
            MaiorABC = (MaiorAB + c + Math.Abs(MaiorAB - c)) / 2;
            Console.WriteLine(MaiorABC + " eh o maior");
    }

}