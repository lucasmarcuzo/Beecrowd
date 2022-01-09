using System;

//Developed by: @LucasMarcuzo

class URI
{
    static void Main(string[] args)
    {

        //string[] entrada = Console.ReadLine().Split(' ');

        string entrada = "";

        while ((entrada = Console.ReadLine()) != null)
        {
			int X = entrada.Substring(); //<<<<<<<<<<<<<<<
			int Y = int.Parse(entrada[1]);
			int M = int.Parse(entrada[2]);

			for (int i = 0; i < M; i++) {

                string[] entrada2 = Console.ReadLine().Split(' ');

				int Xi = int.Parse(entrada2[0]);
				int Yi = int.Parse(entrada2[1]);

				if ((X >= Xi && Y >= Yi) || (X >= Yi && Y >= Xi))   
					Console.WriteLine("Sim");
				else
					Console.WriteLine("Nao");
			}

            entrada = Console.ReadLine().Split(' ');
		}     
    }
}

