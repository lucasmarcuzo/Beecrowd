using System; 

//Developed by: @LucasMarcuzo

class URI1157 {

    static void Main(string[] args) { 

        int n;

        n=int.Parse(Console.ReadLine());

        for (int i = 1; i <= n; i++)
        {
            if(n % i == 0){

                Console.WriteLine(i);
            }
        }
    }
}