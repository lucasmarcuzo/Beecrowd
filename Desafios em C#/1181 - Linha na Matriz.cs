//Developed by: @LucasMarcuzo

using System; 

class URI1181 {

    static void Main(string[] args) { 
        
        float[,] m = new float[12, 12];
        float soma = 0, media = 0;
        float elemento;
        int linha;
        char operacao;

        linha = Convert.ToInt32(Console.ReadLine());
        operacao = Convert.ToChar(Console.ReadLine());

        for (int i = 0; i < 12; i++)
        {
            for (int j = 0; j < 12; j++)
            {
                elemento = Convert.ToSingle(Console.ReadLine());
                m[i, j] = elemento;
            }
        }

        if (operacao == 'S')
        {
            int i = linha;
            while (i == linha)
            {
                for (int j = 0; j < 12; j++)
                {
                    soma += m[i, j];
                }
                i++;
            }
            Console.WriteLine($"{soma:f1}");
        }
        else if (operacao == 'M')
        {
            int i = linha;
            while (i == linha)
            {
                for (int j = 0; j < 12; j++)
                {
                    media += m[i, j];
                }
                i++;
            }
            Console.WriteLine($"{media / 12:f1}");
        }
    }

}