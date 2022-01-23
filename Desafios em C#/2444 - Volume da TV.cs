using System; 

class URI {

    static void Main(string[] args) { 

        string[] linha = Console.ReadLine().Split(' ');

        int volumeInicial = int.Parse(linha[0]);
        int numModificacoes = int.Parse(linha[1]);
        int totalVolume = volumeInicial;
          
        string[] aux = Console.ReadLine().Split(' ');
                
        for(int i = 0; i < numModificacoes; i++){
            totalVolume += int.Parse(aux[i]);
            if(totalVolume < 0) totalVolume = 0;
            else if(totalVolume > 100) totalVolume = 100;
        }
          
        Console.WriteLine(totalVolume);

    }

}