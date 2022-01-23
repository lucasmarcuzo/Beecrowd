using System; 

class URI {

    static void Main(string[] args) { 
        
        string[] linha = Console.ReadLine().Split(' ');

        int numAlunos = int.Parse(linha[0]);
        int numPc = int.Parse(linha[1]);
        int qtsPcsQuebrados = int.Parse(linha[2]);
        int qtsPcsSemComp = int.Parse(linha[3]);
        
        if (numPc - (numAlunos + qtsPcsQuebrados + qtsPcsSemComp + 1) >= 0){
          Console.WriteLine("Igor feliz!");
        } 
        else {
          if ((qtsPcsSemComp / 2) < qtsPcsQuebrados) Console.WriteLine("Caio, a culpa eh sua!");
          else Console.WriteLine("Igor bolado!");
        }

    }

}