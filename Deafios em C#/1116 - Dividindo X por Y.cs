using System; 

//Developed by: @LucasMarcuzo
class URI1116 {
    static void Main(string[] args) { 

        int n, x, y, i;
        float resultado = 0;
        
        n=int.Parse(Console.ReadLine());

        for (i = 0; i < n; i++){

            string[] linha = Console.ReadLine().Split(' ');

            x = int.Parse(linha[0]);
            y = int.Parse(linha[1]);
            
            if (y == 0){

            Console.WriteLine("divisao impossivel");

            }else{

            resultado = (float)x/y;
            Console.WriteLine("{0:f1}", resultado);

            }
        }    
    }    
}   