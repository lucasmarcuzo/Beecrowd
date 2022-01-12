using System; 

//Developed by: @LucasMarcuzo
class URI1893 {

    static void Main(string[] args) { 

        string[] linha = Console.ReadLine().Split(' ');
 
        int inicio = int.Parse(linha[0]);
        int fim = int.Parse(linha[1]);
        
        if(inicio >= 0 && fim <= 2 ) Console.WriteLine("nova");
        else if(inicio >= 3 && fim <= 96 && inicio > fim) Console.WriteLine("minguante");
        else if(fim >= 97 && inicio <= 100) Console.WriteLine("cheia");
        else if (fim >= 3 && inicio <= 96) Console.WriteLine("crescente");
        
        

    }

}