//Developed by: @LucasMarcuzo

using System; 
using System.Collections.Generic;

class URI 
{
    static void Main(string[] args) 
    {   
        string input;
    	while ((input = Console.ReadLine()) != null && input != "") {
    	  
            String[] relogio = input.Split(':'); 
    		
    		int hora = int.Parse(relogio[0]);
    		int min = int.Parse(relogio[1]);
    		
    		switch (hora) {
    			case(7): Console.WriteLine("Atraso maximo: " + min); break;
    			case(8): Console.WriteLine("Atraso maximo: " + (60 + min)); break;
    			case(9): Console.WriteLine("Atraso maximo: " + (120 + min)); break;
    			default: Console.WriteLine("Atraso maximo: 0"); break;
    		}
    
        }
    }
}