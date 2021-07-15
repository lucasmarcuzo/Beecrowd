using System; 
using System.Globalization;

//Developed by: @LucasMarcuzo

class URI1008 {

    static void Main(string[] args) { 

        int num, horas;
        double salario, total;

        num=Convert.ToInt32(Console.ReadLine());
        horas=Convert.ToInt32(Console.ReadLine());
        salario=Convert.ToDouble(Console.ReadLine());

        total=horas*salario;

        Console.WriteLine("NUMBER = {0}",num);
        Console.WriteLine("SALARY = U$ {0}", total.ToString("0.00"));


    }

}