using System;

//Developed by: @LucasMarcuzo

namespace _2685_A_Mudanca_Continua
{
    class Program
    {
        static void Main(string[] args)
        {
    	    float x;
            string t;

            while (!string.IsNullOrEmpty(t = Console.ReadLine())){

                double y = Convert.ToDouble(t);
        
                x = (int)y;
                int horas = ((int)(y * 240) / 3600) % 60;
                int minutos = ((int)(y * 240) / 60) % 60;
                int segundos = (int)(y * 240) % 60;
        
                if (x >= 0 && x < 90 || x == 360)
                    Console.WriteLine("Bom Dia!!\n{0:D2}:{1:D2}:{2:D2}", (horas + 6) % 24, minutos, segundos);
                else if (x >= 90 && x < 180)
                    Console.WriteLine("Boa Tarde!!\n{0:D2}:{1:D2}:{2:D2}", (horas + 6) % 24, minutos, segundos);
                else if (x >= 180 && x < 270)
                    Console.WriteLine("Boa Noite!!\n{0:D2}:{1:D2}:{2:D2}", (horas + 6) % 24, minutos, segundos);
                else if (x >= 270 && x < 360)
                    Console.WriteLine("De Madrugada!!\n{0:D2}:{1:D2}:{2:D2}", (horas + 6) % 24, minutos, segundos);
                    
            
            }
        }
    }
}
