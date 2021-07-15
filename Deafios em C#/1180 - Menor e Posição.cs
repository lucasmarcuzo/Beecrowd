using System; 

//Developed by: @LucasMarcuzo

class URI1180 {

    static void Main(string[] args) { 

        int n, x, y=1000, z;
        x=z=0;

        n=int.Parse(Console.ReadLine());

        int[] vet = new int[n];

        string[] linha = Console.ReadLine().Split(' ');

        for (int i = 0; i <vet.Length; i++)
        {
            vet[i] = int.Parse(linha[i]);

            if(vet[i] < y)
            {
                y = vet[i];
                z=i;
            }
        }

        Console.WriteLine("Menor valor: {0}", y);
        Console.WriteLine("Posicao: {0}", z);
    }
}