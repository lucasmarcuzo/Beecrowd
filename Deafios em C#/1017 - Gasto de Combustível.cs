using System; 

//Developed by: @LucasMarcuzo
class URI1017 {
    static void Main(string[] args) { 

        int horas, velocidade;
        double combustivel=12.0;

        horas=int.Parse(Console.ReadLine());
        velocidade=int.Parse(Console.ReadLine());

        double total=(velocidade * horas)/combustivel;

        string med1 = string.Format("{0:00.000}", total);
        Console.WriteLine(med1);

    }

}