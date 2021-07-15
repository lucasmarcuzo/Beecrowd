using System; 

//Developed by: @LucasMarcuzo
class URI1060 {
    static void Main(string[] args) { 

        int x=0;

        double[] vetor=new double[6];

        for(int i=0; i<vetor.Length; i++)
        {
           vetor[i]=double.Parse(Console.ReadLine());
        }

        for (int i=0; i<vetor.Length; i++)
        {
            if(vetor[i]>0){

                x++;
            }
        }

        Console.WriteLine("{0} valores positivos",x);
    }
}