using System; 

//Developed by: @LucasMarcuzo
class URI1132 {
    static void Main(string[] args) { 

       int x, y, soma = 0, i, aux = 0;

        x=int.Parse(Console.ReadLine());
        y=int.Parse(Console.ReadLine());
        
        if (y < x){

            aux = x;
            x = y;
            y = aux;
        }

        for (i = x; i <= y; i++)
        {

            if (i % 13 != 0){

            soma += i;

            }
        }

        Console.WriteLine(soma);
    }
}