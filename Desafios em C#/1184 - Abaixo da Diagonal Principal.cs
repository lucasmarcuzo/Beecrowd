using System; 

//Developed by: @LucasMarcuzo

class URI1184 {

    static void Main(string[] args) { 

        float[,] x = new float[12,12];
        float total = 0;

        char tipo = Convert.ToChar(Console.ReadLine());
        
        for (int i = 0; i < 12; i++)
        {
            for (int j = 0; j < 12; j++)
            {
                x[i,j] = float.Parse(Console.ReadLine());
            }
        }
        
        for (int i = 0; i < 12; i++)
        {
            for (int j = 0; j < i; j++)
            {
                total += x[i,j]; 
            }
        }
        
        if (tipo == 'S') Console.WriteLine("{0:F1}",total);
        else if (tipo == 'M') Console.WriteLine("{0:F1}",total/66.0f);

    }

}