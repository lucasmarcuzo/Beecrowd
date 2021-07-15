using System; 

//Developed by: @LucasMarcuzo

class URI1009 {

    static void Main(string[] args) { 

        string nome;
        double salario, totalvendas, total;

        nome=Convert.ToString(Console.ReadLine());
        salario=Convert.ToDouble(Console.ReadLine());
        totalvendas=Convert.ToDouble(Console.ReadLine());

        total=salario + (totalvendas * 0.15);

        Console.WriteLine("TOTAL = R$ {0:000.00}", total);

    }

}