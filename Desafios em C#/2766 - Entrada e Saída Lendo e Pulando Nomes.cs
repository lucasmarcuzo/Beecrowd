using System;

class URI {
    
  static void Main() {
      
    string[] nomes = new string[10];
		
	for(int i = 0 ; i < 10 ; i++)
	{
		nomes[i] = Console.ReadLine();
	}
	
	for(int i = 1 ; i <= 10 ; i++)
	{
	  	if(i == 2 || i == 6 || i == 8)
	  	{
		  Console.WriteLine(nomes[i]);
		}
	}
  }
}