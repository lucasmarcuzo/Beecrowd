using System; 
using System.Globalization;

//Developed by: @LucasMarcuzo

class URI1174 {

    static void Main(string[] args) { 

        int i=0;

        double[] vet = new double[100];

        do
        {
            vet[i]=double.Parse(Console.ReadLine(), CultureInfo.InvariantCulture);
            i++;

        } while (i < 100);
        

        for (int j = 0; j <vet.Length; j++)
        {
            if(vet[j] <= 10)
            {

                Console.WriteLine("A[{0}] = {1:f1}", j, vet[j]);    
            }
            
        }
        
    }

}