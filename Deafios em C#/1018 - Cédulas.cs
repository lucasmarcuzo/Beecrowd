using System; 

//Developed by: @LucasMarcuzo
class URI1018 {

    static void Main(string[] args) { 

        int notes, aux;

        notes=int.Parse(Console.ReadLine());
        
        Console.WriteLine(notes);
        
        Console.WriteLine("{0} nota(s) de R$ 100,00", notes/100);
        aux = (notes%100);

        Console.WriteLine("{0} nota(s) de R$ 50,00", aux/50);
        aux = (aux%50);

        Console.WriteLine("{0} nota(s) de R$ 20,00", aux/20);
        aux = (aux%20);

        Console.WriteLine("{0} nota(s) de R$ 10,00", aux/10);
        aux = (aux%10);

        Console.WriteLine("{0} nota(s) de R$ 5,00", aux/5);
        aux = (aux%5);

        Console.WriteLine("{0} nota(s) de R$ 2,00", aux/2);
        aux = (aux%2);

        Console.WriteLine("{0} nota(s) de R$ 1,00", aux/1);

    }

}