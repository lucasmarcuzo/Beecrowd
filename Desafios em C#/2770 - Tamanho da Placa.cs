using System;

//Developed by: @LucasMarcuzo

class URI
{
    static void Main(string[] args)
    {

        string input = "";

        while ((input = Console.ReadLine()) != null && input != "")
        {
			String[] entrada = input.Split(' '); 
			int X = int.Parse(entrada[0]); 
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
		}     
    }
}

