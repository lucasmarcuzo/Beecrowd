using System; 

//Developed by: @LucasMarcuzo
class URI1037 {

    static void Main(string[] args) { 

        float x;

        x=float.Parse(Console.ReadLine());

        if (x >= 0 && x <= 25.0000)
        {
            Console.WriteLine("Intervalo [0,25]");

        }else if(x >= 25.00001  && x <= 50.0000000)
        {
            Console.WriteLine("Intervalo (25,50]");

        }else if(x >= 50.0000001  && x <= 75.0000000)
        {
            Console.WriteLine("Intervalo (50,75]");

        }else if(x >= 75.0000001  && x <= 100.0000000)
        {
            Console.WriteLine("Intervalo (75,100]");

        }else
        {
            Console.WriteLine("Fora de intervalo");
        }

    }

}