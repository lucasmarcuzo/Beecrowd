using System; 

//Developed by: @LucasMarcuzo
class URI {

    static void Main(string[] args) { 

        double dinheiro = double.Parse(Console.ReadLine());
        double[] valor = { 100, 50, 20, 10, 5, 2, 1, 0.5, 0.25, 0.1, 0.05, 0.01 };
        int quantidadedenotas;
        
        Console.WriteLine("NOTAS:");

        for (int i=0;i<6;i++)
        {
            quantidadedenotas = (int)(dinheiro / valor[i]);
            Console.WriteLine(quantidadedenotas + " nota(s) de R$ " + valor[i].ToString("0.00"));
            dinheiro -= quantidadedenotas * valor[i];
            dinheiro = Math.Round(dinheiro, 2);
        }
        
        Console.WriteLine("MOEDAS:");
        for (int i = 6; i < valor.Length; i++)
        {
            quantidadedenotas = (int)(dinheiro / valor[i]);
            Console.WriteLine(quantidadedenotas + " moeda(s) de R$ " + valor[i].ToString("0.00"));
            dinheiro -= quantidadedenotas * valor[i];
            dinheiro = Math.Round(dinheiro, 2);
        }
        Console.ReadKey();

    }

}