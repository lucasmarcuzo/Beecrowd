using System; 

//Developed by: @LucasMarcuzo
class URI1097 {
    static void Main(string[] args) { 

      int[] vet = {7, 6, 5, 9, 8, 7, 11, 10, 9, 13, 12, 11, 15, 14, 13};

      int[] vet2 = new int[15];

      int j=0;

      for (int i = 1; i < 10; i = i +2)
      {
        vet2[i]=i;

        Console.WriteLine("I={0} J={1}", vet2[i], vet[j]);
        j++;
        Console.WriteLine("I={0} J={1}", vet2[i], vet[j]);
        j++;
        Console.WriteLine("I={0} J={1}", vet2[i], vet[j]);
        j++;

      }
    
    }

}