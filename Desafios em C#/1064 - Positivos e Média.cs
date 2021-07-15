using System; 
using System.Globalization;

//Developed by: @LucasMarcuzo
class URI {

    static void Main(string[] args) { 

        double x=0, y=0, cont=0, z=0.0;
        double[] vetor = new double[6];

        for (int i = 0; i < vetor.Length; i++)
        {   
            vetor[i]=double.Parse(Console.ReadLine(), CultureInfo.InvariantCulture);

            if(vetor[i] > z)
            {
                x = x + vetor[i];
                cont++;
                y = (double)x/cont;
            }
        }
        
        Console.WriteLine("{0} valores positivos", cont);
        Console.WriteLine("{0:f1}", y);

    }

}