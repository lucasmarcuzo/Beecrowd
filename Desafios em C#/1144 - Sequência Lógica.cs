using System; 

//Developed by: @LucasMarcuzo

class URI {

    static void Main(string[] args) { 

        int n;

        n=int.Parse(Console.ReadLine());

       for (int i = 1; i <= n; i++)
       {
           Console.WriteLine("{0} {1} {2}", i, Math.Pow(i, 2), Math.Pow(i, 3));
           Console.WriteLine("{0} {1} {2}", i, Math.Pow(i, 2)+1, Math.Pow(i, 3)+1);  
       }
    }
}