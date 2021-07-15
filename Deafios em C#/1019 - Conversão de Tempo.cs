using System; 

//Developed by: @LucasMarcuzo
class URI1019 {
    static void Main(string[] args) { 

        int tempo;

        tempo=int.Parse(Console.ReadLine());

        int hora= tempo / 3600;
        tempo= tempo - (hora * 3600);

        int min= tempo / 60;
        tempo= tempo - (min * 60);

        Console.WriteLine("{0}:{1}:{2}",hora,min,tempo);

    }

}