using System;

//Developed by: @LucasMarcuzo

namespace _2685_A_Mudanca
{
    class Program
    {
        static void Main(string[] args)
        {
            string input;
            while (!string.IsNullOrEmpty(input = Console.ReadLine())) {

                int graus = int.Parse(input);
                
                if ( graus >= 0 && graus < 90 ) {
                Console.WriteLine("Bom Dia!!");
                }
                else if ( graus >= 90 && graus < 180 ){
                Console.WriteLine("Boa Tarde!!");
                }
                else if ( graus >= 180 && graus < 270 ){
                Console.WriteLine("Boa Noite!!");
                }
                else if ( graus >=  270 && graus < 360){
                Console.WriteLine("De Madrugada!!");
                }
                else{
                Console.WriteLine("Bom Dia!!");
                }
    		
    	    }




        }
    }
}
