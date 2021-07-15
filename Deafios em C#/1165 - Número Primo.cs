using System; 

//Developed by: @LucasMarcuzo

class URI1165 {

    static void Main(string[] args) { 

        int n, x=0, y=0;

        n=int.Parse(Console.ReadLine());

        for (int i = 1; i <= n; i++)
        {
            x=int.Parse(Console.ReadLine());

            y=0;

            for (int j=1; j < x; j++)
            {
                if(x % j == 0)
                {
                    y+=j;
                } 
                
            }

            if(y == 1)
            {
                Console.WriteLine("{0} eh primo",x);

            }else
            {
                Console.WriteLine("{0} nao eh primo",x);
            }
        }
    }
}