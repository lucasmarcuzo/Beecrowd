using System; 

//Developed by: @LucasMarcuzo

class URI1177 {

    static void Main(string[] args) { 

       int m, z=1000;

       m=int.Parse(Console.ReadLine());

       int[] vet=new int[m];

       for (int i = 0; i < m; i++)
       {
           vet[i]=i;
       }

       for (int v=0, j=0; v < z; v++)
       {
            Console.WriteLine("N[{0}] = {1}", v, vet[j]);
            j++;

            if(j == m)
            {
                j=0;
            }
       }
    }
}