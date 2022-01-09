using System; 

//Developed by: @LucasMarcuzo

class URI {

    static void Main(string[] args) { 

        int x = int.Parse(Console.ReadLine());
        string natal = "Feliz nat";

        for (var i = 0; i < x; i++)
        {
            natal += "a";
        }

        natal += "l!";

        Console.WriteLine(natal);
        



    }

}