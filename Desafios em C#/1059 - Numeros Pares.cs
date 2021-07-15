using System; 

//Developed by: @LucasMarcuzo
class URI1059 {

    static void Main(string[] args) { 

        int[] vetor = new int[101];

        for(int i=1;i<vetor.Length;i++)
        {  
           vetor[i]=i;  
        }

        for(int j=1;j<vetor.Length;j++)
        {  
           
           int x=vetor[j] % 2;

            if(x == 0)
            {

                Console.WriteLine(vetor[j]);

            } 
        }
    }
}