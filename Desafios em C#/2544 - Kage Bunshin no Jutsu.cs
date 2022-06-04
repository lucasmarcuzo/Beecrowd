//Developed by: @LucasMarcuzo

using System; 

class URI 
{
    static void Main(string[] args) 
    { 
		string input;
		while ((input = Console.ReadLine()) != null && input != "") 
		{
            int N = int.Parse(input);
			Console.WriteLine(log2(N));
		}
    
    }

    private static int log2(int N) 
    {
		return (int) (Math.Log(N) / Math.Log(2));
	}
}