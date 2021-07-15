using System;

//Developed by: @LucasMarcuzo
class URI1041 {
  static void Main(string[] args) {
   
    float x, y, z=0.0f;
   
    String linha = Console.ReadLine();

    string[] array = linha.Split(' ');

    x=float.Parse(array[0]);
    y=float.Parse(array[1]);

    if(x == z && y == z){

        Console.WriteLine("Origem");

    }else if (x == z){
            
        Console.WriteLine("Eixo Y");

    }else if (y == z){
        
        Console.WriteLine("Eixo X");

    }else if(x > z && y > z){

        Console.WriteLine("Q1");

    }else if(x < z && y > z){

        Console.WriteLine("Q2");

    }else if(x < z && y < z){

        Console.WriteLine("Q3");
        
    }else if(x > z && y < z){

        Console.WriteLine("Q4");
        
    }
   
  }
}