//Developed by: @LucasMarcuzo

using System; 
using System.Collections;

class URI 
{
    static void Main(string[] args) 
    {   
        Queue numsPares = new Queue();
        Queue numsImpares = new Queue();
        int impares = 0, pares = 0;

        for(int i=0; i < 15; i++){
            int x = int.Parse(Console.ReadLine());

            if(x % 2 == 0){
                numsPares.Enqueue(x);
                pares++;
            }
            else{
                numsImpares.Enqueue(x);
                impares++;
            }

            if(impares == 5){
                for (int j = 0; j < 5; j++) {
                    Console.WriteLine("impar[{0}] = {1}",j, numsImpares.Dequeue());
                    impares = 0;
                }
            }
            else if (pares == 5){
                for (int j = 0; j < 5; j++) {
                    Console.WriteLine("par[{0}] = {1}",j, numsPares.Dequeue());
                    pares = 0;
                }
            }
        }
        
        int imparIndex=0;
        int parIndex=0;
        while(numsImpares.Count != 0){
            Console.WriteLine("impar[{0}] = {1}",imparIndex, numsImpares.Dequeue());
            imparIndex++;
        }
        while(numsPares.Count != 0){
             Console.WriteLine("par[{0}] = {1}",parIndex, numsPares.Dequeue());
            parIndex++;
        }
    }
}
