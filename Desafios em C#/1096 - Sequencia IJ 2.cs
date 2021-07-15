using System; 

//Developed by: @LucasMarcuzo
class URI1096 {
    static void Main(string[] args) { 

      int[] vet = {7, 6, 5};

      int[] vet2 = new int[15];

      for (int i = 1; i < 10; i = i +2)
      {
        int j=0;

        vet2[i]=i;

        Console.WriteLine("I={0} J={1}", vet2[i], vet[j]);
        j++;
        Console.WriteLine("I={0} J={1}", vet2[i], vet[j]);
        j++;
        Console.WriteLine("I={0} J={1}", vet2[i], vet[j]);

      }
    
    }

}