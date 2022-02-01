using System;

//Developed by: @LucasMarcuzo
public class Main1963 {
	
    public static void Main(string[] args) {

        String[] linha = Console.ReadLine().Split(' ');
    	
    	double A = double.Parse(linha[0]);
    	double B = double.Parse(linha[1]);
      
        double valorIngresso = (((B - A) / A) * 100);
      
        Console.WriteLine("{0:F2}%", valorIngresso);
      
    }
	
}