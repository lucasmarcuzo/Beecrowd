using System; 

//Developed by: @LucasMarcuzo

class URI1002 {

    static void Main(string[] args) { 

        double n=3.14159;
        double raio = Convert.ToDouble(Console.ReadLine());
        double area=n*Convert.ToDouble(Math.Pow(raio, 2));
       
        Console.WriteLine("A={0:F4}", area);          
       

    }

}