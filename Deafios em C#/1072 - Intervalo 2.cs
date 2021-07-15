using System; 

//Developed by: @LucasMarcuzo
class URI1072 {
    static void Main(string[] args) { 

        int n, x=0, y=0;

        n=int.Parse(Console.ReadLine());

        int[] vet = new int[n];


        for(int i = 0; i <vet.Length; i++){

            vet[i]=int.Parse(Console.ReadLine());
            
            if(vet[i] >= 10 && vet[i] <= 20){

                x++;

            }else{

                y++;
            }
        }

        Console.WriteLine("{0} in", x);
        Console.WriteLine("{0} out", y);

    }

}