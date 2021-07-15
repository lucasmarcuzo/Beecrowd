using System; 

//Developed by: @LucasMarcuzo
class URI1065 {

    static void Main(string[] args) { 

        int x=0;

        int[] vetor = new int[5];

        for(int i=0; i<vetor.Length; i++)
        {
           vetor[i]=int.Parse(Console.ReadLine());
        }

        for(int i=0; i<vetor.Length; i++)
        {
            if(vetor[i] % 2 == 0){
               x++;
            }
        }

        Console.WriteLine("{0} valores pares", x);

    }

}