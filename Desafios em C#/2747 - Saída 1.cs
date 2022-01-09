using System; 

//Developed by: @LucasMarcuzo

class URI {

    static void Main(string[] args) { 

        for (int i = 1; i < 40; i++) {
           Console.Write("-");
        }

        for (int i = 0; i < 5; i++) {
            
           Console.WriteLine();
            for (int j = 1; j < 40; j++) {
    
                if(j == 1 || j == 39){
                   Console.Write("|");
                }else{
                   Console.Write(" ");  
                }
            }
        }

       Console.WriteLine();
        for (int i = 1; i < 40; i++) {
           Console.Write("-");
        }
       Console.WriteLine();
    }

}