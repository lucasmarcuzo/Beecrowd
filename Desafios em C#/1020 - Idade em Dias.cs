using System; 

//Developed by: @LucasMarcuzo
class URI1020 {

    static void Main(string[] args) { 
        
        int notes, aux;

        notes=int.Parse(Console.ReadLine());

        Console.WriteLine("{0} ano(s)", notes/365);
        aux = (notes%365);

        Console.WriteLine("{0} mes(es)", aux/30);
        aux = (aux%30);

        Console.WriteLine("{0} dia(s)", aux/1);
   
   }
}