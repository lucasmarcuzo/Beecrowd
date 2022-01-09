using System; 

//Developed by: @LucasMarcuzo

class URI {

    static void Main(string[] args) { 

        String[] linha = Console.ReadLine().Split(' ');
    
		int horasaida = int.Parse(linha[0]);
		int tempoviagem = int.Parse(linha[1]);
		int fuso = int.Parse(linha[2]);

        int total = (horasaida + tempoviagem + fuso);
		
        if(total >= 24){

            total = (total - 24);
        }
        else if (total < 0)
        {
            total = (24 + total);
        }
           	
		Console.WriteLine(total);
	
    }

}