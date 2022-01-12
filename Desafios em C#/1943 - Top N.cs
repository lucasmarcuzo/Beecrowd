using System; 

//Developed by: @LucasMarcuzo
class URI1943 {

    static void Main(string[] args) { 

        int[] TOPS = {1, 3, 5, 10, 25, 50, 100};
        
        int K = Convert.ToInt32(Console.ReadLine());
        
        if(K == TOPS[0]) Console.WriteLine("Top 1");
        else if(K <= TOPS[1]) Console.WriteLine("Top 3");
        else if(K <= TOPS[2]) Console.WriteLine("Top 5");
        else if(K <= TOPS[3]) Console.WriteLine("Top 10");
        else if(K <= TOPS[4]) Console.WriteLine("Top 25");
        else if(K <= TOPS[5]) Console.WriteLine("Top 50");
        else Console.WriteLine("Top 100");

    }

}
