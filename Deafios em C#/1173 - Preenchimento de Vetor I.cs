using System; 

//Developed by: @LucasMarcuzo

class URI1173 {

    static void Main(string[] args) { 

        int x;

        int[] vet = new int[10];

        x=int.Parse(Console.ReadLine());

        for (int i = 0; i < 10; i++)
        {
            vet[i]=x;
            Console.WriteLine("N[{0}] = {1}", i, vet[i]);
            x=x*2;
            
        }
    }
}
